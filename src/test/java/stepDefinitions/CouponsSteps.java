package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.AgePage;
import pagesobjects.CouponObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CouponsSteps {
    private WebDriver driver;

    static CouponObjects couponObjects;

    public CouponsSteps() {
        this.driver = Hooks.driver;
        couponObjects = PageFactory.initElements(Hooks.driver, CouponObjects.class);

    }

    @Given("^I go to monitors category$")
    public void i_go_to_monitors_category() throws Throwable {
        driver.get("http://www.demoshop24.com/");
        couponObjects.gotoMonitors();
    }

    @When("^I apply coupon \"([^\"]*)\"$")
    public void i_apply_coupon_something(String coupon) throws Throwable {
        couponObjects.applyCoupon(coupon);
    }

    @Then("^I check price \"([^\"]*)\"$")
    public void i_check_price_something(String price) throws Throwable {
        couponObjects.priceCheck(price);
    }

    @And("^I add monitor to cart$")
    public void i_add_monitor_to_cart() throws Throwable {
        couponObjects.addSamsungtoCart();
    }

    @And("^I navigate to shopping cart$")
    public void i_navigate_to_shopping_cart() throws Throwable {
        couponObjects.goToCart();
    }
    @Then("^I remove item from cart$")
    public void i_remove_item_from_cart() throws Throwable {
        couponObjects.removeItem();
    }

}
