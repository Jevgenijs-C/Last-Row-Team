package pagesobjects;


import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AgePage {
    @FindBy(how = How.CSS, using = ".dropdown-menu a[href*=\"login\"]")
    private WebElement loginBtn;
    @FindBy(how = How.CSS, using = ".caret")
    private WebElement loginBtnPre;
    @FindBy(how = How.NAME, using = "email")
    private WebElement emailField;
    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;
    public java.lang.String getPageUrl() {
        return "http://demoshop24.com/";
    }
    @FindBy(how = How.CSS, using = "[value=\"Login\"]")
    private WebElement loginConfirm;

    private WebDriver driver;


    public void loggingIn(String email, String password) throws InterruptedException {
        loginBtnPre.click();
        loginBtn.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginConfirm.click();
    }
}
