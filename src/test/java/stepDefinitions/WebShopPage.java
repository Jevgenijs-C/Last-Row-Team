package stepDefinitions;

        import org.openqa.selenium.NoSuchElementException;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class WebShopPage {
    @FindBy(how = How.CSS, using = "#top-links > ul > li:nth-child(5) ")
    private WebElement topCheckoutLink;
    @FindBy(how = How.CSS, using = "#content > div.row > div:nth-child(2) > div > div.image > a")
    private WebElement iPhone;
    @FindBy(how = How.ID, using = "button-cart")
    private WebElement addToChart;
    @FindBy(how = How.CSS, using = "#top-links > ul > li:nth-child(4) > a")
    private WebElement topShoppingChartButton;
    @FindBy(how = How.CSS, using = "#content > div.buttons.clearfix > div.pull-right > a")
    private WebElement blueCheckoutButton;
    @FindBy(how = How.ID, using = "cart")
    private WebElement blackWindow;
    @FindBy(how = How.CSS, using = "#cart > ul")
    private WebElement popurWindow;
    @FindBy(how = How.CSS, using = "#cart > ul > li:nth-child(2) > div > p > a:nth-child(2)")
    private WebElement internalCheckoutLink;
    @FindBy(how = How.NAME, using = "account")
    private WebElement guestLink;
    @FindBy(how = How.ID, using = "input-email")
    private WebElement emailField;
    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;
    @FindBy(how = How.CSS, using = "#top-links > ul > li:nth-child(5) > a")
    private WebElement topCheckoutButton;
    @FindBy(how = How.CSS, using = "#collapse-checkout-option > div > div > div:nth-child(2)")
    private WebElement returningCustomer;
    @FindBy(how = How.CSS, using = "#collapse-payment-address > div > form > div:nth-child(3)")
    private WebElement addingNewAddress;
    @FindBy(how = How.CSS, using = "#top-links > ul > li.dropdown > a")
    private WebElement accountButton;
    @FindBy(how = How.CSS, using = ".list-inline  ul > li:nth-of-type(2) > a")
    private WebElement loginInternalButton;
    @FindBy(how = How.CSS, using = "form[method='post'] > input[value='Login']")
    private WebElement blueLoginButton;
    @FindBy(how = How.CSS, using = ".nav.navbar-nav > li:nth-of-type(6) > a")
    private WebElement phonesAndPDAs;
    @FindBy(how = How.CSS, using = "#collapse-payment-address > div > form > div:nth-child(1)")
    private WebElement useExistingAddress;
    @FindBy(how = How.ID, using = "button-payment-address")
    private WebElement buttonPaymentAddress;
    @FindBy(how = How.ID, using = "button-shipping-address")
    private WebElement buttonShippingAddress;
    @FindBy(how = How.ID, using = "button-shipping-method")
    private WebElement buttonShippingMethod;



    private WebDriver driver;

    public WebShopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void existanceTopCheckoutLink() {
        topCheckoutLink.isEnabled();
    }
    public void clickTopChekoutLink(){
        topCheckoutLink.click();
    }

    public void clickIPhone() {
        iPhone.click();
    }

    public void clickAddToChart() {
        addToChart.click();
    }

    public void clickTopShoppingChartButton() {
        topShoppingChartButton.click();
    }

    public void existanceBlueCheckoutButton() {
        blueCheckoutButton.isEnabled();
    }

    public void clickBlackWindow() {
        blackWindow.click();
    }

    public void existancePopurWindow() {
        waitForElementVisibility(popurWindow, 2);
    }

    public void existanceInternalCheckoutLink() {
        waitForElementVisibility(internalCheckoutLink, 4);
        internalCheckoutLink.isEnabled();
    }

    public void existnaceGuestLink() {
        waitForElementVisibility(guestLink, 5);
        guestLink.isEnabled();
    }
    public void existanceAddingNewAddress() {
        waitForElementVisibility(addingNewAddress, 5);
        addingNewAddress.isEnabled();
    }

    public void typeEmailField() throws InterruptedException {
        waitForElementVisibility(emailField, 4);
        emailField.sendKeys("corsatomy@gmail.com");
    }
    public void typePasswordField() {
        waitForElementVisibility(passwordField, 4);
        passwordField.sendKeys("123456");
    }
    public void clickTopCheckoutButton() {
        topCheckoutButton.click();
    }
    public void existanceReturningCustomer() throws InterruptedException {
        Thread.sleep(2000);
        returningCustomer.isEnabled();
    }
    public void clickAccountButton() {
        accountButton.click();
    }
    public void clickLoginInternalButton() {
        loginInternalButton.click();
    }
    public void clickBlueLoginButton() {
        blueLoginButton.click();
    }
    public void clickPhonesAndPDAs() {
        waitForElementVisibility(phonesAndPDAs, 4);
        phonesAndPDAs.click();
    }
    public void existanceUseExistingAddress() {
        waitForElementVisibility(useExistingAddress, 4);
        useExistingAddress.isEnabled();
    }
    public void clickButtonPaymentAddress() {
        waitForElementVisibility(buttonPaymentAddress, 4);
        buttonPaymentAddress.click();
    }
    public void clickButtonShippingAddress() {
        waitForElementVisibility(buttonShippingAddress, 4);
        buttonShippingAddress.click();

    }
    public void clickButtonShippingMethod() throws InterruptedException {
        Thread.sleep(3000);
        buttonShippingMethod.click();

    }

    private void waitForElementVisibility(WebElement webElement, int timeoutInSeconds) {
        new WebDriverWait(driver, timeoutInSeconds)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(webElement));
    }
}