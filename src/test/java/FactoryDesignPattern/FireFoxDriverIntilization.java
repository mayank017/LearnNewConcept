package FactoryDesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverIntilization implements WebDriverIntialization {

    WebDriver driver;

    public void FireFoxDriverIntilization() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Override
    public void getUrl(String url) {
        driver.get(url);
    }
}
