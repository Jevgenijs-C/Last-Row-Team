package pagesobjects;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static junit.framework.TestCase.assertEquals;


public class CouponObjects {
    @FindBy(how = How.CSS, using = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > a")
    private WebElement components;
    @FindBy(how = How.CSS, using = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(3) > div > div > ul > li:nth-child(2) > a")
    private WebElement monitors;
    @FindBy(how = How.CSS, using = "#content > div:nth-child(5) > div:nth-child(2) > div > div:nth-child(2) > div.button-group > button:nth-child(1)")
    private WebElement samsungMon;
    @FindBy(how = How.CSS, using = "#cart > button")
    private WebElement cart;
    @FindBy(how = How.CSS, using = "#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong")
    private WebElement viewcart;
    @FindBy(how = How.CSS, using = "#accordion > div:nth-child(1) > div.panel-heading > h4 > a")
    private WebElement opencoupon;
    @FindBy(how = How.NAME, using = "coupon")
    private WebElement couponField;
    @FindBy(how = How.ID, using = "button-coupon")
    private WebElement couponBtn;
    @FindBy(how = How.CSS, using = "#content > div.row > div > table > tbody > tr:nth-child(3) > td:nth-child(2)")
    private WebElement priceTotal;
    @FindBy(how = How.CLASS_NAME, using = "fa fa-times-circle")
    private WebElement removeBtn;
    private WebDriver driver;

    public void gotoMonitors(){
        components.click();
        monitors.click();
    }
    public void addSamsungtoCart(){
        samsungMon.click();
    }
    public void goToCart(){
        cart.click();
        viewcart.click();
    }
    public void applyCoupon(String coupon) throws InterruptedException {
        opencoupon.click();
        couponField.sendKeys(coupon);
        couponBtn.click();
    }
    public void priceCheck(String price) throws InterruptedException {
        assertEquals(price,priceTotal.getText());
    }
    public void removeItem(){
        removeBtn.click();
    }

}
