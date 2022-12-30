package pageObjects;

public class LoginPage extends BasePage {

    private String searchButton = "//input[contains(@id,'nav-search-submit-buttonn')]";
    private String searchTextField = "//input[contains(@id,'twotabsearchtextbox')]";
    private String firstResult = "";
    public LoginPage(){
        super(driver);
    }

    public void navigateToAmazon(){

        navigateTo("https://www.amazon.es/");

    }

    public void clickAmazonSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }

}


