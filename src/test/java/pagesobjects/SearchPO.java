package pagesobjects;

//import org.apache.xpath.operations.String;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;

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
    @FindBy(how = How.CSS, using = "#content > div > div:nth-child(2) > select")
    private WebElement category;
    @FindBy(how = How.CSS, using = "#content > div > div:nth-child(2) > select > option:nth-child(18)")
    private WebElement phones;
    @FindBy(how = How.XPATH, using = "/html/body/footer/div/div/div[1]/ul/li[1]/a")
    private WebElement aboutUs;
    @FindBy(how = How.CSS, using = "#button-search")
    private WebElement secondarySearch;
    @FindBy(how = How.CSS, using = "#menu a[href$='category&path=57']")
    private WebElement tablets;


    public java.lang.String getPageUrl() {
        return "http://demoshop24.com/";
    }
    public void existenceSearchField() {
        searchField.isEnabled();
    }
    public void existencePageNumber() {
        pageNumber.isEnabled();
    }
    public void existenceSorting() {
        sorting.isEnabled();
    }
    private WebDriver driver;

    public void SearchFieldIs(String searchField) {
        driver.get("http://demoshop24.com/");
    }
    public WebElement getSearchField() {
        return searchField;
    }
    public void SearchButton() {
        searchButton.click();
    }
    public WebElement getValue() {
        return value;
    }
    public void AboutUs() {
        aboutUs.click();
    }
    public void Tablets() {
        tablets.click();
    }
    public void SecondarySearch() {
        secondarySearch.click();
    }
}