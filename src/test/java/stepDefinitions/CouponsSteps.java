package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesobjects.AgePage;
import pagesobjects.CouponObjects;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CouponsSteps {
    private WebDriver driver;
    static CouponObjects couponObjects;


    public CouponsSteps() {
        this.driver = Hooks.driver;
        couponObjects = PageFactory.initElements(Hooks.driver, CouponObjects.class);
        couponObjects.setDriver(driver);
    }

    @When("^I apply coupon \"([^\"]*)\"$")
    public void i_apply_coupon_something(String coupon) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        couponObjects.applyCoupon(coupon);
    }

    @Then("^I check price \"([^\"]*)\"$")
    public void i_check_price_something(String price) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        couponObjects.priceCheck(price);
    }

    @Then("^I remove item from cart$")
    public void i_remove_item_from_cart() throws Throwable {
        couponObjects.removeItem();
    }

    @Given("^I am in shopping cart with added monitor$")
    public void iAmInShoppingCartWithAddedMonitor() {
        driver.get("http://www.demoshop24.com/");
        couponObjects.gotoMonitors();
        couponObjects.addSamsungtoCart();
        couponObjects.goToCart();
    }

    @And("^Clear cart$")
    public void clearCart() {
        couponObjects.goToCart();
        couponObjects.removeItem();
        driver.get("http://www.demoshop24.com/");
    }

    @And("^I check that shipping is free$")
    public void iCheckThatShippingIsFree() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        couponObjects.shippingCheck();
    }
}
