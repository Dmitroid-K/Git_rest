package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

public class CommonStepdefs {

    public static final String URL = "https://api.github.com/";

    @Given("User is authorized")
    public void userHasAToken() {
        RestAssured.requestSpecification = Specifications.requestSpecAuthorized(URL);
    }

    @Given("User is not authorized")
    public void userHasNoToken(){
        RestAssured.requestSpecification = Specifications.requestSpec(URL);
    }

    @Then("Response code is {int}")
    public void responseCodeIs(int code) {
        RestAssured.responseSpecification = steps.Specifications.responseSpec(code);
    }
}
