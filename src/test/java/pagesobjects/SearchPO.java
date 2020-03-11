package pagesobjects;

//import org.apache.xpath.operations.String;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPO {
    @FindBy(how = How.CSS, using = "#search > input")
    private WebElement searchField;
   // private WebElement loginBtnPre;
  //  @FindBy(how = How.NAME, using = "email")
   // private WebElement emailField;
  //  @FindBy(how = How.NAME, using = "password")
  //  private WebElement passwordField;
    public java.lang.String getPageUrl() {return "http://demoshop24.com/";
    }

    public void existanceSearchField() {
        searchField.isEnabled();
    }

    private WebDriver driver;


    public void SearchFieldIs(String searchField) throws InterruptedException {
        //Thread.sleep(1000);
           driver.get("http://demoshop24.com/");
        //Thread.sleep(1000);
       // loginBtnPre.click();
     //   loginBtn.click();
        // Thread.sleep(1000);
     //   emailField.sendKeys(email);
        // Thread.sleep(1000);
    //    passwordField.sendKeys(password);
        // Thread.sleep(1000);
      //  loginConfirm.click();
    }
}
