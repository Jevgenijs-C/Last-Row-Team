package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class checkoutStepsDifinitions {

    private WebDriver driver;
    static WebShopPage webShopPage;


    public checkoutStepsDifinitions() {
        this.driver = Hooks.driver;
        webShopPage = PageFactory.initElements(Hooks.driver, WebShopPage.class);
    }
    @Given("^I am on web shop page$")
    public void iAmOnWebShopPage() {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }
//////////////////////////////Checkout link in Top Menu/////////////////////////
    @Then("^Checkout link should be accessable$")
    public void checkoutLinkShouldBeAccessable() {
        webShopPage.existanceTopCheckoutLink();
    }
////////////////////////////Finding Checkout button on Checkout page////////////////////
    @When("^Add any product to cart$")
    public void addAnyProductToCart() {
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.image > a")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    @And("^Pressing shopping cart$")
    public void pressingShoppingCart() {
        driver.findElement(By.cssSelector("#top-links > ul > li:nth-child(4) > a")).click();
    }

    @Then("^Blue checkout button should be seen in right bottom corner$")
    public void blueCheckoutButtonShouldBeSeenInRightBottomCorner() {
        driver.findElement(By.cssSelector("#content > div.buttons.clearfix > div.pull-right > a")).isEnabled();
    }


//////////////////////////////Checkout link in black popur window//////////////////////////////////////////
    @When("^Pick any product\\(s\\)$")
    public void pickAnyProductS() {
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.image > a")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    @And("^Click on black window \\(Top right corner\\)$")
    public void clickOnBlackWindowTopRightCorner() {
        driver.findElement(By.id("cart")).click();
    }

    @And("^Get popur window$")
    public void getPopurWindow() {
        driver.findElement(By.cssSelector("#cart > ul")).click();
    }

    @Then("^On right side should be Checkout button$")
    public void onRightSideShouldBeCheckoutButton() {
        driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(2)")).isEnabled();
    }
/////////////////////////////// User press checkout without logging in system - guest case/////////////////////
    //UNABLE PASS//
    @When("^Adding any product in cart$")
    public void addingAnyProductInCart() {
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.image > a")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    @And("^Press checkout on top right corner$")
    public void pressCheckoutOnTopRightCorner() {
        driver.findElement(By.cssSelector("#top-links > ul > li:nth-child(5) > a")).click();
    }

    @Then("^<Guest Checkout> option should be available$")
    public void guestCheckoutOptionShouldBeAvailable() {
        driver.findElement(By.cssSelector("#collapse-checkout-option > div > div > div:nth-child(1) > div:nth-child(4)")).isEnabled();
    }
///////////////////////////////User press checkout without logging in system - sign in case////////////
    @When("^Add any product in cart$")
    public void addAnyProductInCart() {
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.image > a")).click();
        driver.findElement(By.id("button-cart")).click();
    }
    @And("^Press checkout in top right corner$")
    public void pressCheckoutInTopRightCorner() {
        driver.findElement(By.cssSelector("#top-links > ul > li:nth-child(5) > a")).click();
    }

    @Then("^<Returning Customer> subtitle should be available$")
    public void returningCustomerSubtitleShouldBeAvailable() {
        driver.findElement(By.cssSelector("#collapse-checkout-option > div > div > div:nth-child(2)")).isEnabled();

    }
//////////////////////////////Using existing adress during purchasing process
    @When("^Press My Account in top menu$")
    public void pressMyAccountInTopMenu() {
    }

    @And("^Choose Login$")
    public void chooseLogin() {
    }

    @And("^Enter E-Mail Address$")
    public void enterEMailAddress() {
    }

    @And("^Enter Password$")
    public void enterPassword() {
    }

    @And("^Press Login$")
    public void pressLogin() {
    }

    @And("^Press checkout$")
    public void pressCheckout() {
    }

    @And("^User is on Billing address$")
    public void userIsOnBillingAddress() {
    }

    @Then("^Should be option use existing address$")
    public void shouldBeOptionUseExistingAddress() {
    }

    @Then("^Should be option to add new address$")
    public void shouldBeOptionToAddNewAddress() {
    }

    @And("^User is on Payment Method step\\((\\d+)th Step\\)$")
    public void userIsOnPaymentMethodStepThStep(int arg0) {
    }

    @Then("^Should be option to choose payment method \\(only one - cash\\)$")
    public void shouldBeOptionToChoosePaymentMethodOnlyOneCash() {
    }

    @And("^User pressing Continue without toggling  \"([^\"]*)\"$")
    public void userPressingContinueWithoutToggling(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Getting error \"([^\"]*)\"$")
    public void gettingError(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Press Tablets in top bar menu$")
    public void pressTabletsInTopBarMenu() {
    }

    @And("^Choose \"([^\"]*)\" and add it to cart$")
    public void chooseAndAddItToCart(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Press checkout on top right side of menu$")
    public void pressCheckoutOnTopRightSideOfMenu() {
    }
}
