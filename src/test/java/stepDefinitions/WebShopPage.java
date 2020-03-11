package stepDefinitions;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;

public class WebShopPage {
    @FindBy(how = How.CSS, using = "#top-links > ul > li:nth-child(5) ")
        private WebElement topCheckoutLink;

    public void existanceTopCheckoutLink() {
            topCheckoutLink.isEnabled();
    }

}