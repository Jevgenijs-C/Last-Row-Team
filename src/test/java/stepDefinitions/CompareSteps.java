package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.EditPage;

public class CompareSteps {

    private WebDriver driver;

    static EditPage EditPage;

    public CompareSteps() {
        this.driver = Hooks.driver;
        EditPage = PageFactory.initElements(Hooks.driver, EditPage.class);
    }
    //NEED TO ADD @Given("^I log in to web app with e-mail \"([^\"]*)\" and password \"([^\"]*)\"$")
    //public void i_log_in_to_web_app_with_e_mail_and_password(String arg1, String arg2) throws Throwable {

    }

    @When("^I go to Edit Account section$")
    public void i_go_to_Edit_Account_section() throws Throwable {
        EditPage.getLoginButtonPre().click();
        EditPage.getLoginButton().click();
    }

    ///@Then("^I compare first name with my input data \"([^\"]*)\"$")
    public void i_compare_first_name_with_my_input_data(String firstName) throws Throwable {
    String firstName =
            asserEquals ("qwe", firstName);


    }

    @Then("^I compare second name with my input data \"([^\"]*)\"$")
    public void i_compare_second_name_with_my_input_data(String secondName) throws Throwable {

    }

    @Then("^I compare e-mail  with my input data \"([^\"]*)\"$")
    public void i_compare_e_mail_with_my_input_data(String email) throws Throwable {

    }

    @Then("^I compare telephone with my input data \"([^\"]*)\"$")
    public void i_compare_telephone_with_my_input_data(String phone) throws Throwable {

    }


}
