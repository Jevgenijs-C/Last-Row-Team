package stepDefinitions;

import cucumber.api.java.en.Given;
//import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.AgePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import pagesobjects.SearchPO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchSteps {

    private WebDriver driver;
    static SearchPO searchPO;

    public SearchSteps() {
        this.driver = Hooks.driver;
        searchPO = PageFactory.initElements(Hooks.driver, SearchPO.class);
    }
//________1__________________________

    @Given("^I am on web shop page$")
    public void i_am_on_web_shop_page() {
        driver.get("http://demoshop24.com/");
    }

    @When("^I see Search field on the home page$")
    public void i_see_search_field_on_the_home_page()  {
        searchPO.existanceSearchField();
    }

    @And("^I press \"([^\"]*)\" in footer$")
    public void i_press_something_in_footer(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I see Search$")
    public void i_see_search() throws Throwable {
        throw new PendingException();
    }

    @And("^I press \"([^\"]*)\"$")
    public void i_press(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I see Search field$")
    public void i_see_search_field() throws Throwable {
        throw new PendingException();
    }

    //________2________________________________

    @When("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I see: \"([^\"]*)\"$")
    public void i_see_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^The result is shown: \"([^\"]*)\"$")
    public void the_result_is_shown_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I push \"([^\"]*)\" in footer$")
    public void i_push_something_in_footer(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^type \"([^\"]*)\" in Searching field$")
    public void type_something_in_searching_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I see the result: \"([^\"]*)\"$")
    public void i_see_the_result_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Searching field$")
    public void i_type_something_in_searching_field(String strArg1) throws Throwable {
        throw new PendingException();
    }
    @Then("^There is: \"([^\"]*)\"$")
    public void there_is_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
//_____________3_______________________________

@When("^I am on the home page I press Search button$")
public void i_am_on_the_home_page_i_press_search_button() throws Throwable {
    throw new PendingException();
}

    @Then("^Result is not shown$")
    public void result_is_not_shown() throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I tick \"([^\"]*)\" box$")
    public void i_tick_something_box(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press Search$")
    public void i_press_search() throws Throwable {
        throw new PendingException();
    }
    //_______________4_____________________________

    @When("^I press Search button$")
    public void i_press_search_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^Result is shown: \"([^\"]*)\"$")
    public void result_is_shown_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I tick \"([^\"]*)\" box$")
    public void i_tick_something_box(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press Search$")
    public void i_press_search() throws Throwable {
        throw new PendingException();
    }
    //_________________5__________________________

    @When("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I see the result: \"([^\"]*)\" with pagination as well as opportunity to sort$")
    public void i_see_the_result_something_with_pagination_as_well_as_opportunity_to_sort(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press Search$")
    public void i_press_search() throws Throwable {
        throw new PendingException();
    }

    @And("^I see the result: \"([^\"]*)\" with pagination plus with opportunity to sort$")
    public void i_see_the_result_something_with_pagination_plus_with_opportunity_to_sort(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press \"([^\"]*)\" in footer$")
    public void i_press_something_in_footer(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Searching field$")
    public void i_type_something_in_searching_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press \"([^\"]*)\" in Search field$")
    public void i_press_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }
//___________________6___________________________

@When("^I am on the home page$")
public void i_am_on_the_home_page() throws Throwable {
    throw new PendingException();
}

    @Then("^Result is shown: \"([^\"]*)\"$")
    public void result_is_shown_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press Search$")
    public void i_press_search() throws Throwable {
        throw new PendingException();
    }
}



