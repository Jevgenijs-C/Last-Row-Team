package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesobjects.AgePage;

import static org.junit.Assert.assertFalse;
import static stepDefinitions.GoogleSteps.agePage;


public class checkoutStepsDifinitions {

    private WebDriver driver;
    static WebShopPage webShopPage;
    private static WebDriverWait wait;

    public checkoutStepsDifinitions() {
        this.driver = Hooks.driver;
        webShopPage = PageFactory.initElements(Hooks.driver, WebShopPage.class);
        agePage = PageFactory.initElements(Hooks.driver, AgePage.class);
        wait = new WebDriverWait(driver, 5);

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
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }

    @And("^Pressing shopping cart$")
    public void pressingShoppingCart() {
        webShopPage.clickTopShoppingChartButton();
    }

    @Then("^Blue checkout button should be seen in right bottom corner$")
    public void blueCheckoutButtonShouldBeSeenInRightBottomCorner() {
       webShopPage.existanceBlueCheckoutButton();
    }

//////////////////////////////Checkout link in black popur window//////////////////////////////////////////
    @When("^Pick any product\\(s\\)$")
    public void pickAnyProductS() {
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }

    @And("^Click on black window \\(Top right corner\\)$")
    public void clickOnBlackWindowTopRightCorner() {
       webShopPage.clickBlackWindow();
    }

    @And("^Get popur window$")
    public void getPopurWindow() {
        webShopPage.existancePopurWindow();
    }

    @Then("^On right side should be Checkout button$")
    public void onRightSideShouldBeCheckoutButton() {
       webShopPage.existanceInternalCheckoutLink();
    }
/////////////////////////////// User press checkout without logging in system - guest case/////////////////////
    //UNABLE PASS//already able but with dirty WAIT, need to use wait.until(ExpectedConditions.presenceOfElementLocated(By));
    @When("^Adding any product in cart$")
    public void addingAnyProductInCart() {
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }

    @And("^Press checkout on top right corner$")
    public void pressCheckoutOnTopRightCorner() {
    webShopPage.clickTopCheckoutButton();
    }

    @Then("^<Guest Checkout> option should be available$")
    public void guestCheckoutOptionShouldBeAvailable() {
        webShopPage.existnaceGuestLink();
    }
///////////////////////////////User press checkout without logging in system - sign in case////////////
    ///UNABLE PASS//already able but with dirty WAIT, need to use wait.until(ExpectedConditions.presenceOfElementLocated(By));
    @When("^Add any product in cart$")
    public void addAnyProductInCart() {
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }
    @And("^Press checkout in top right corner$")
    public void pressCheckoutInTopRightCorner() {
        webShopPage.clickTopCheckoutButton();
    }

    @Then("^<Returning Customer> subtitle should be available$")
    public void returningCustomerSubtitleShouldBeAvailable() throws InterruptedException {
        webShopPage.existanceReturningCustomer();
    }
//////////////////////////////Using existing adress during purchasing process
    @When("^Press My Account in top menu$")
    public void pressMyAccountInTopMenu() {
       webShopPage.clickAccountButton();
    }

    @And("^Choose Login$")
    public void chooseLogin() {
        webShopPage.clickLoginInternalButton();
    }

    @And("^Enter E-Mail Address$")
    public void enterEMailAddress() throws InterruptedException {
       webShopPage.typeEmailField();
    }
    @And("^Enter Password$")
    public void enterPassword() throws InterruptedException{
        webShopPage.typePasswordField();
    }

    @And("^Press Login$")
    public void pressLogin() {
        webShopPage.clickBlueLoginButton();
    }

    @And("^Press Phones&PDAs on top panel$")
    public void pressPhonesPDAsOnTopPanel()throws InterruptedException {
        webShopPage.clickPhonesAndPDAs();

    }
    @And("^Add any product to cartt$")
    public void addAnyProductToCartt() throws InterruptedException{
        Thread.sleep(2500);
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }

    @And("^Press checkout$")
    public void pressCheckout(){
    webShopPage.clickTopChekoutLink();
    }

    @And("^User is on Billing address$")
    public void userIsOnBillingAddress() {
        driver.findElement(By.cssSelector("#accordion > div:nth-child(2)")).isEnabled();
    }

    @Then("^Should be option use existing address$")
    public void shouldBeOptionUseExistingAddress() throws InterruptedException {
        webShopPage.existanceUseExistingAddress();
    }
//////////////////////////////////////// Adding NEW address during purchasing process
@When("^Press My Account in top menuu$")
    public void pressMyAccountInTopMenuu() {
    webShopPage.clickAccountButton();
}

    @And("^Choose Loginn$")
    public void chooseLoginn() {
        webShopPage.clickLoginInternalButton();
    }

    @And("^Enter E-Mail Addresss$")
    public void enterEMailAddresss() throws InterruptedException {
        webShopPage.typeEmailField();
    }
    @And("^Enter Passwordd$")
    public void enterPasswordd() throws InterruptedException{
        webShopPage.typePasswordField();
    }

    @And("^Press Loginn$")
    public void pressLoginn() {
        webShopPage.clickBlueLoginButton();
    }

    @And("^Press Phones&PDAs on top panell$")
    public void pressPhonesPDAsOnTopPanell()throws InterruptedException {
        webShopPage.clickPhonesAndPDAs();

    }
    @And("^Add any product to carttt$")
    public void addAnyProductToCarttt() throws InterruptedException{
        Thread.sleep(2500);
        webShopPage.clickIPhone();
        webShopPage.clickAddToChart();
    }

    @And("^Press checkoutt$")
    public void pressCheckoutt(){
        webShopPage.clickTopChekoutLink();
    }

    @And("^User is on Billing addresss$")
    public void userIsOnBillingAddresss() {
        driver.findElement(By.cssSelector("#accordion > div:nth-child(2)")).isEnabled();
    }
    @Then("^Should be option to add new address$")
    public void shouldBeOptionToAddNewAddress() throws InterruptedException {
        webShopPage.existanceAddingNewAddress();
    }
////////////////////////////////Choosing payment method
    @And("^Press Continue")
    public void pressContinue() throws InterruptedException {
        webShopPage.clickButtonPaymentAddress();
    }
    @And("^On step three press continue$")
    public void onStepThreePressContinue() throws InterruptedException {
        Thread.sleep(2500);
        webShopPage.clickButtonShippingAddress();
    }
    @And("^On step four press continue$")
    public void onStepFourPressContinue() throws InterruptedException {
       webShopPage.clickButtonShippingMethod();
    }

    @Then("^Should be option to choose payment method \\(only one - cash\\)$")
    public void shouldBeOptionToChoosePaymentMethodOnlyOneCash() throws InterruptedException {
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#collapse-payment-method > div > div.radio")).isEnabled();
    }
//////////////////////////////////Marking "I have read and agree to the Terms & Conditions" box///////////////////
    @And("^On step three press continuee$")
        public void onStepThreePressContinuee() throws InterruptedException {
    webShopPage.clickButtonShippingAddress();
}
    @And("^On step four press continuee$")
        public void onStepFourPressContinuee() throws InterruptedException {
        webShopPage.clickButtonShippingMethod();
    }

    @And("^User pressing Continue without toggling  \"([^\"]*)\"$")
    public void userPressingContinueWithoutToggling(String arg0) throws Throwable {
        Thread.sleep(2500);
        driver.findElement(By.id("button-payment-method")).click();
    }
    @And("^Getting error$")
    public void gettingError() throws InterruptedException {
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#collapse-payment-method > div > div.alert.alert-danger.alert-dismissible")).isEnabled();
    }
    ///////////////////////////////Checkout process with out of stock products///////////////////////
    @When("^Press Tablets in top bar menu$")
    public void pressTabletsInTopBarMenu() {
        driver.findElement(By.cssSelector(".nav.navbar-nav > li:nth-of-type(4) > a")).click();
    }

    @And("^Choose \"([^\"]*)\" and add it to cart$")
    public void chooseAndAddItToCart(String arg0) {
        driver.findElement(By.cssSelector("#content > div:nth-child(3) > div > div > div:nth-child(2) > div.caption > h4")).click();
    }

    @And("^Press checkout on top right side of menu$")
    public void pressCheckoutOnTopRightSideOfMenu() {
        driver.findElement(By.cssSelector("#top-links > ul > li:nth-child(5) > a")).click();
    }

    @Then("^Getting error \"([^\"]*)\"$")
    public void gettingError(String arg0) {
        driver.findElement(By.cssSelector("a[title='Checkout'] > .hidden-md.hidden-sm.hidden-xs")).isEnabled();
    }
}
