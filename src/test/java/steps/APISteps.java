package steps;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APISteps {
    private static RequestSpecification request;
    private Response response;
    private ValidatableResponse json;
    @Given("^I send a GET request to the endpoint$")
    public void sendGETRequest(){
        request = given()
                .baseUri("https://reqres.in/api")
                .contentType(ContentType.JSON);
    }

    @Then("^I get a (\\d+) status code$")
    public void expectedStatusCode(int expectedStatusCode){
        response = request
                .when()
                .get("/users?page=2");
        json = response
                .then()
                .statusCode(expectedStatusCode);
    }
}
