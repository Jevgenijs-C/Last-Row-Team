package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.RegisterPage;

//import org.apache.xpath.operations.String;

public class RegistrationSteps {


private WebDriver driver;

   static RegisterPage registerPage;

   public RegistrationSteps() {
       this.driver = Hooks.driver;
       registerPage = PageFactory.initElements(Hooks.driver, RegisterPage.class);
}
    @Given("^I go to web app$")
    public void iGoToWebApp() {
        driver.get("http://demoshop24.com/");
    }

    @When("^I navigate to Registration form$")
    public void iNavigateToRegistrationForm() {

    }

    @Then("^I check if <field> is available$")
    public void iCheckIfFieldIsAvailable() {
    }
}



