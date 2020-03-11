package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.RegisterPage;

import java.util.List;

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
        registerPage.getRegisterButtonPre().click();
        registerPage.getRegisterButton().click();
    }

    @Then("^I check if fields is available$")
    public void iCheckIfFieldIsAvailable() {
       checkIfExists(registerPage.getFirstName());
       checkIfExists(registerPage.getSecondName());
       checkIfExists(registerPage.getEmail());
       checkIfExists(registerPage.getPhoneNumber());
       checkIfExists(registerPage.getPassword());
       checkIfExists(registerPage.getPasswordConfirm());
       checkIfExists(registerPage.getRadioButton());
       checkIfExists(registerPage.getCheckbox());
    }

    @And("^I input \"([^\"]*)\" in First name, input \"([^\"]*)\" in Second name, check agreement checkbox$")
    public void iInputInFirstNameFieldInputInSecondNameFieldCheckAgreementCheckbox(String name, String seconName) throws Throwable {
        registerPage.prepareToRegistration(name, seconName);
    }


    @Given("^I input \"([^\"]*)\" in phone number field$")
    public void iInputInPhoneNumberField(String phone) throws Throwable {
        registerPage.getPhoneNumber().sendKeys(phone);
    }

    @And("^I input \"([^\"]*)\" in password field$")
    public void iInputInPasswordField(String pass) throws Throwable {
        registerPage.getPassword().sendKeys(pass);
    }

    @And("^I input \"([^\"]*)\" in confirm password field$")
    public void iInputInConfirmPasswordField(String pass) throws Throwable {
        registerPage.getPasswordConfirm().sendKeys(pass);
    }

    @And("^I input \"([^\"]*)\" in email field$")
    public void iInputInEmailField(String email) throws Throwable {
        registerPage.getEmail().sendKeys(email);
    }

    @When("^I click on Continue button$")
    public void iClickOnContinueButton() {
       registerPage.getContinueButton().click();
    }

    @Then("^User is registered$")
    public void userIsRegistered() {
    }
    @Then("^I See Error message \"([^\"]*)\"$")
    public void iSeeErrorMessage(String errMsg) throws Throwable {
       Assert.assertEquals(registerPage.getPhoneDanger().getText(), errMsg);
    }
    private void checkIfExists(WebElement webElement){
        Assert.assertTrue(webElement.isDisplayed());
    }



}



