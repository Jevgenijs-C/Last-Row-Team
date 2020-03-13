package pagesobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPage {
    //TODO check path
   @FindBy (how = How.CSS, using = "#column-right [href$=\"edit\"]")
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

    public WebElement getEditButton() {return editButton;}

    public WebElement getEdFirstName() {
        return edFirstName;
    }

    public WebElement getEdSecondName() {
        return edSecondName;
    }

    public WebElement getEdEmail() {
        return edEmail;
    }

    public WebElement getEdPhoneNumber() {
        return edPhoneNumber;
    }
}
