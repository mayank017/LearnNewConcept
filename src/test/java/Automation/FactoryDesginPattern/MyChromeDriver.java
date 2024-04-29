package Automation.FactoryDesginPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyChromeDriver implements DriverInterface {

    private ChromeDriver driver;

    public MyChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }


}
