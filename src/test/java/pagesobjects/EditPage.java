package pagesobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPage {
    @FindBy(how = How.CSS, using = ".dropdown-open a[href*=\"login\"")
            private WebElement loginButton;
            @FindBy(how = How.CSS, using = ".caret")
            private WebElement loginButtonPre;
    @FindBy (how = How.XPATH, using = ".list-group a[href*=\\\"Edit Account|\"")
    private WebElement editButton;
    @FindBy(how = How.NAME, using = "firstname")
    private WebElement edFirstName;
    @FindBy(how = How.NAME, using = "lastname")
    private WebElement edSecondName;
    @FindBy(how = How.NAME, using = "email")
    private WebElement edEmail;
    @FindBy(how = How.NAME, using = "telephone")
    private WebElement edPhoneNumber;


    private WebDriver driver;

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLoginButtonPre() {
        return loginButtonPre;
    }


}
