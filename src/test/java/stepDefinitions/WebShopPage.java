package stepDefinitions;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;

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
//d

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
        popurWindow.click();
    }

    public void existanceInternalCheckoutLink() {
        internalCheckoutLink.isEnabled();
    }

    public void existnaceGuestLink() {
        guestLink.isEnabled();
    }

    public void typeEmailField() {
        emailField.sendKeys("fakemail@fakehost.lol");
    }
    public void typePasswordField() {
        passwordField.sendKeys("fakepassword");
    }
    public void clickTopCheckoutButton() {
        topCheckoutButton.click();
    }
    public void existanceReturningCustomer() {
        returningCustomer.isEnabled();
    }
}