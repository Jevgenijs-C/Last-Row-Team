package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.AgePage;
import pagesobjects.EditPage;

public class CompareSteps {

    public static final String VALUE = "value";
    private WebDriver driver;

    static EditPage editPage;
    static AgePage agePage;

    public CompareSteps() {
        this.driver = Hooks.driver;
        editPage = PageFactory.initElements(Hooks.driver, EditPage.class);
        agePage = PageFactory.initElements(Hooks.driver, AgePage.class);
    }

    @Given("^I log in to web app with e-mail \"([^\"]*)\", password \"([^\"]*)\"$")
    public void iLogInToWebAppWithEMailPassword(String email, String passWord) throws Throwable {
        driver.get("http://demoshop24.com/");
        agePage.loggingIn(email, passWord);
    }


    @When("^I go to Edit Account section$")
    public void i_go_to_Edit_Account_section() throws Throwable {
        editPage.getEditButton().click();
    }


    @Then("^I compare first name \"([^\"]*)\", second name \"([^\"]*)\", e-mail \"([^\"]*)\", phone \"([^\"]*)\"$")
    public void iCompareFirstNameSecondNameEMailPhone(String fName, String lName, String email, String phone) throws Throwable {
        Assert.assertEquals(editPage.getEdFirstName().getAttribute(VALUE), fName);
        Assert.assertEquals(editPage.getEdSecondName().getAttribute(VALUE), lName);
        Assert.assertEquals(editPage.getEdEmail().getAttribute(VALUE), email);
        Assert.assertEquals(editPage.getEdPhoneNumber().getAttribute(VALUE), phone);
    }


}
