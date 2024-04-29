package POM.WithOutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
    WebDriver driver;

    public LoginClass(WebDriver driver) {
        this.driver = driver;
    }

    By searchTextBox = By.xpath("abcs");

    public  void searchinSearchTextbox(String text) {
        driver.findElement(searchTextBox).sendKeys(text);
    }

}
