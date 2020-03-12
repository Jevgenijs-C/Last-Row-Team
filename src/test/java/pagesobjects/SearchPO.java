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
    //@FindBy(how = How.NAME, using = "input_word")
    //private WebElement word;
    @FindBy(how = How.CSS, using = "#search > span > button")
    private WebElement searchButton;
    @FindBy(how = How.NAME, using = "searchingValue")
    private WebElement value;
    @FindBy(how = How.CSS, using = "#content > div:nth-child(9) > div.col-sm-6.text-right")
    private WebElement pageNumber;
    @FindBy(how = How.CSS, using = "#input-sort")
    private WebElement sorting;
    @FindBy(how = How.CLASS_NAME, using = ".row")
    private WebElement result;

    public java.lang.String getPageUrl() {
        return "http://demoshop24.com/";
    }

    public void existenceSearchField() {
        searchField.isEnabled();
    }

    public void existencepageNumber() {
        pageNumber.isEnabled();
    }

    public void existencesorting() {
        sorting.isEnabled();
    }

    private WebDriver driver;

    public void SearchFieldIs(String searchField) {
        driver.get("http://demoshop24.com/");
    }

    public WebElement getsearchField() {
        return searchField;
    }
    public WebElement getsearchButton() {
        return searchButton;
    }
    public WebElement getvalue() {
        return value;
    }
    public WebElement getresult() {
        return result;
    }
}