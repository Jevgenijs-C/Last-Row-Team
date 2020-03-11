package pagesobjects;

//import org.apache.xpath.operations.String;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
    @FindBy(how = How.CSS, using = "#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
    private WebElement registerButton;
    @FindBy(how = How.CSS, using = ".caret")
    private WebElement registerButtonPre;
    public java.lang.String getPageUrl() {
        return "http://demoshop24.com/";
    }
    @FindBy(how = How.ID, using = "input-firstname")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "input-lastname")
    private WebElement secondName;
    @FindBy(how = How.ID, using = "input-email")
    private WebElement email;
    @FindBy(how = How.ID, using = "input-telephone")
    private WebElement phoneNumber;
    @FindBy(how = How.ID, using = "input-password")
    private WebElement password;
    @FindBy(how = How.ID, using = "input-confirm")
    private WebElement passwordConfirm;
    @FindBy(how = How.CSS, using = "#content > form > fieldset:nth-child(3) > div")
    private WebElement radioButtonSub;
    @FindBy(how = How.NAME, using = "agree")
    private WebElement checkboxAgree;
    @FindBy (how = How.CLASS_NAME, using = "btn-primary")
    private WebElement continueButton;
    @FindBy (how = How.XPATH, using = "/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/div")
    private WebElement phoneDanger;

    private WebDriver driver;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getRegisterButtonPre() {
        return registerButtonPre;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getSecondName() {
        return secondName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getPasswordConfirm() {
        return passwordConfirm;
    }

    public WebElement getRadioButton() {
        return radioButtonSub;
    }

    public WebElement getCheckbox() {
        return checkboxAgree;
    }

    public WebElement getPhoneDanger() {
        return phoneDanger;
    }

    public void prepareToRegistration(String name, String seconName) {
        firstName.sendKeys(name);
        secondName.sendKeys(seconName);
        checkboxAgree.click();
    }
}





