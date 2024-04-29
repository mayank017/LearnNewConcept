package Automation.FactoryDesginPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements DriverInterface{

    private FirefoxDriver driver;

    public MyFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }
}
