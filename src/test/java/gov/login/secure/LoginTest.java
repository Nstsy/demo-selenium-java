package gov.login.secure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://secure.login.gov/");
        String buttonXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By buttonBy = By.xpath(buttonXpath);
        WebElement buttonWebElement = webDriver.findElement(buttonBy);
        buttonWebElement.click();
    }
}
