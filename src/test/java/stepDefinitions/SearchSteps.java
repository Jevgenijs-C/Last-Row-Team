package stepDefinitions;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import cucumber.api.java.en.Given;
//import org.apache.xpath.operations.String;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.AgePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import pagesobjects.SearchPO;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class SearchSteps {

    private WebDriver driver;
    static SearchPO onlineShop;
    private WebElement searchValue;
    WebElement value;

    public SearchSteps() {
        this.driver = Hooks.driver;
        onlineShop = PageFactory.initElements(Hooks.driver, SearchPO.class);
    }
//________1__________________________

    @Given("^I am on web shop page$")
    public void i_am_on_web_shop_page() {
        driver.get("http://demoshop24.com/");
    }

    @When("^I see Search field$")
    public void i_see_search_field() throws Throwable {
        onlineShop.existenceSearchField();
    }

    @And("^I see Search field on \"([^\"]*)\" page$")
    public void i_see_search_field_on_something_page(String strArg1) throws Throwable {
        driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a")).click();
        onlineShop.existenceSearchField();
    }

    @Then("^I see Search on \"([^\"]*)\" page$")
    public void i_see_search_on_something_page(String strArg1) throws Throwable {
        driver.findElement(By.cssSelector("#menu a[href$='category&path=57']")).click();
        onlineShop.existenceSearchField();
    }

    //________2________________________________

    @When("^I input \"([^\"]*)\" in Search field$")
    public void i_input_something_in_search_field(String value) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^The result is shown: \"([^\"]*)\"$")
    public void the_result_is_shown_something(String result) throws Throwable {
        assertTrue(driver.findElement(By.className(".row")).isDisplayed());

        //driver.get("http://www.demoshop24.com/index.php?route=product/search&search=htc");
    }
    @And("^I enter \"([^\"]*)\" in Search while on \"([^\"]*)\" page$")
    public void i_enter_something_in_search_while_on_something_page(String value, String strArg) throws Throwable {
        driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^I see the result: \"([^\"]*)\"$")
    public void i_see_the_result_something(String result) throws Throwable {
        //driver.get("http://www.demoshop24.com/index.php?route=product/search&search=htc");
        assertTrue(result, driver.findElement(By.className(".product-thumb")).isDisplayed());
    }

//assertTrue(driver.findElement(By.className("w3-navbar")).isDisplayed());
//    }
    @And("^I type \"([^\"]*)\" in Searching field while on \"([^\"]*)\" page$")
    public void i_type_something_in_searching_field_while_on_something_page(String value, String strArg) throws Throwable {
        driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @Then("^I see: \"([^\"]*)\"$")
    public void i_see_something(String result) throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/search&search=htc");
    }

//_____________3_______________________________

    @When("^I press Search$")
    public void i_press_search() throws Throwable {
        driver.findElement(By.cssSelector("#search > span > button")).click();
    }

    @And("^I type \"([^\"]*)\" in Searching$")
    public void i_type_something_in_searching(String value) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^I tick Product description box$")
    public void i_tick_product_description_box(String name) throws Throwable {
        WebElement checkbox = driver.findElement(By.cssSelector("#description"));
            assertFalse(!checkbox.isSelected());
            checkbox.click();
        assertTrue(checkbox.isSelected());
       // driver.findElement(By.cssSelector("#content > p:nth-child(4) > label")).isSelected();
        driver.findElement(By.cssSelector("#button-search")).click();
    }

    @Then("^Result is not shown$")
    public void result_is_not_shown() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/search&search=%22world%E2%80%99s%20thinnest%20tablet%22&description=true");
    }
    //_______________4_____________________________

    @When("^I press Search button$")
    public void i_press_search_button() throws Throwable {
        driver.findElement(By.cssSelector("#search > span > button")).click();
    }

    @And("^I write \"([^\"]*)\" in Search$")
    public void i_write_something_in_search(String value) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^I tick Subcategories$")
    public void i_tick(String strArg1) throws Throwable {
        WebElement checkbox = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > label > input[type=checkbox]"));
        assertFalse(!checkbox.isSelected());
        checkbox.click();
        assertTrue(checkbox.isSelected());
        // driver.findElement(By.cssSelector("#content > p:nth-child(4) > label")).isSelected();
        driver.findElement(By.cssSelector("#button-search")).click();
    }

    @And("^I click Search$")
    public void i_click_search() throws Throwable {
        driver.findElement(By.cssSelector("#button-search")).click();
    }

    @Then("^Result is \"([^\"]*)\"$")
    public void result_is(String strArg1) throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/search&search=%22world%E2%80%99s%20thinnest%20tablet%22&description=true");
    }

    //_________________5__________________________

    @When("^I Search \"([^\"]*)\"$")
    public void i_search_something(String value) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^I see the result: \"([^\"]*)\" with pagination plus with opportunity to sort$")
    public void i_see_the_result_something_with_pagination_plus_with_opportunity_to_sort(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I type \"([^\"]*)\" in Search while on \"([^\"]*)\" page$")
    public void i_type_something_in_search_while_on_something_page(String value, String strArg) throws Throwable {
        driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @Then("^Result is \"([^\"]*)\" with pagination as well as opportunity to sort$")
    public void result_is_something_with_pagination_as_well_as_opportunity_to_sort(String strArg1) throws Throwable {
        throw new PendingException();
    }

//___________________6___________________________

    @When("^I type: \"([^\"]*)\" in Search field$")
    public void i_type_something_in_search_field(String value) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys(value);
    }

    @And("^Search is done$")
    public void search_is_done() throws Throwable {
        driver.findElement(By.cssSelector("#button-search")).click();
    }

    @Then("^Result is shown: \"([^\"]*)\"$")
    public void result_is_shown_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
}