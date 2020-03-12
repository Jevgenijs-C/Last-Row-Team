package pagesobjects;

import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


public class CouponObjects<startTime> {
    @FindBy(how = How.CSS, using = "li:nth-of-type(3) > .dropdown-toggle")
    private WebElement components;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Monitors')]")
    private WebElement monitors;
    @FindBy(how = How.CSS, using = "#content > div:nth-child(5) > div:nth-child(2) > div > div:nth-child(2) > div.button-group > button:nth-child(1)")
    private WebElement samsungMon;
    @FindBy(how = How.CSS, using = "#cart > button")
    private WebElement cart;
    @FindBy(how = How.CSS, using = ".list-inline .fa.fa-shopping-cart")
    private WebElement viewcart;
    @FindBy(how = How.CSS, using = ".panel a[href*=\"#collapse-coupon\"]")
    private WebElement opencoupon;
    @FindBy(how = How.NAME, using = "coupon")
    private WebElement couponField;
    @FindBy(how = How.ID, using = "button-coupon")
    private WebElement couponBtn;
    @FindBy(how = How.CSS, using = ".col-sm-4 tr:nth-child(3) > .text-right:nth-child(2)")
    private WebElement priceTotal;
    @FindBy(how = How.CSS, using = ".input-group .btn-danger")
    private WebElement removeBtn;
    @FindBy(how = How.CSS, using = ".panel a[href*=\"#collapse-shipping\"]")
    private WebElement openshipping;
    @FindBy(how = How.XPATH, using = "//button[@id='button-quote']")
    private WebElement quoteBtn;
    @FindBy(how = How.CSS, using = "input[name='shipping_method']")
    private WebElement shippingRadio;
    @FindBy(how = How.CSS, using = "#button-shipping")
    private WebElement shippingConfirm;
    @FindBy(how = How.CSS, using = "#content > div.row > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
    private WebElement startprice;
    @FindBy(how = How.CSS, using = "#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    private WebElement finalprice;

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        wait = (WebDriverWait) new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
    }


    public void gotoMonitors() {
        components.click();
        monitors.click();
    }

    public void addSamsungtoCart() {
        samsungMon.click();
    }

    public void goToCart() {
        viewcart.click();
    }

    public void applyCoupon(String coupon) throws InterruptedException {
        opencoupon.click();
        couponField.sendKeys(coupon);
        couponBtn.click();
    }

    public void priceCheck(String price) throws Exception {
        assertEquals(price, priceTotal.getText());
    }

    public void removeItem() {
        removeBtn.click();
    }

    public void shippingCheck() throws Exception {
        openshipping.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='button-quote']")));
        quoteBtn.click();
        shippingRadio.click();
        shippingConfirm.click();
        assertEquals(startprice.getText(), finalprice.getText());


    }

}
