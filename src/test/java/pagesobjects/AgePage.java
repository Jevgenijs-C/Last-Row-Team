package pagesobjects;

//import org.apache.xpath.operations.String;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AgePage {
    @FindBy(how = How.CSS, using = "#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a")
    private WebElement loginBtn;
//    @FindBy(how = How.CSS, using = "#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md")
    @FindBy(how = How.CSS, using = ".caret")
    private WebElement loginBtnPre;
    @FindBy(how = How.NAME, using = "email")
    private WebElement emailField;
    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;
    public java.lang.String getPageUrl() {
        return "http://demoshop24.com/";
    }
    @FindBy(how = How.CSS, using = "#content > div > div:nth-child(2) > div > form > input")
    private WebElement loginConfirm;

    private WebDriver driver;
//test

    public void loggingIn(String email, String password) throws InterruptedException {
        //Thread.sleep(1000);
     //   driver.get("http://demoshop24.com/");
        //Thread.sleep(1000);
        loginBtnPre.click();
        loginBtn.click();
       // Thread.sleep(1000);
        emailField.sendKeys(email);
       // Thread.sleep(1000);
        passwordField.sendKeys(password);
       // Thread.sleep(1000);
        loginConfirm.click();
    }
}
