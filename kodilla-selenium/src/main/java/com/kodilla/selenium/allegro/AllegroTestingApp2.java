package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement yearCombo = driver.findElement(
                By.cssSelector("div>div>button.mgn2_14"));
        yearCombo.click();

        WebElement yearCombo1 = driver.findElement(
                By.cssSelector("div>div>select.mr3m_1"));
        Select yearSelect = new Select(yearCombo1);
        yearSelect.selectByIndex(3);

        WebElement yearCombo2 = driver.findElement(By.cssSelector("div>form>input.mr3m_1"));
        yearCombo2.sendKeys("mavic mini");

        WebElement yearCombo3 = driver.findElement(By.cssSelector("div>form>button._13q9y"));
        yearCombo3.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        List<WebElement> results = driver.findElements(By.cssSelector("section>.mx7m_1 mnyp_co mlkp_ag _9c44d_19pGn"));

        results.get(1).getText();

    }
}
