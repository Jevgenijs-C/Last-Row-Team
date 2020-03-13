package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesobjects.AgePage;

//import org.apache.xpath.operations.String;

public class GoogleSteps {


    private WebDriver driver;

    static AgePage agePage;

    public GoogleSteps() {
        this.driver = Hooks.driver;
        agePage = PageFactory.initElements(Hooks.driver, AgePage.class);

    }


 @Given("^I login using email: \"([^\"]*)\" and password: \"([^\"]*)\"$")
  public void i_login_using_email_and_password(String email, String password) throws Throwable {
     driver.get("http://demoshop24.com/");
    // Thread.sleep(1000);
      agePage.loggingIn(email, password);
  }



}
