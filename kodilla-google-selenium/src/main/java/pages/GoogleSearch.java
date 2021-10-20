package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Search']")
    static WebElement inputField;

    @FindBy(css = "input[value='GoogleSearch']")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }
    public void searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        WebElement acceptCookies = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]/div"));
        acceptCookies.click();
        Thread.sleep(5000);
        WebElement yearCombo = driver.findElement(
                By.name("q"));
        yearCombo.sendKeys("Kodilla");
        yearCombo.submit();
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.randomResults();
        return googleResults;
    }
}