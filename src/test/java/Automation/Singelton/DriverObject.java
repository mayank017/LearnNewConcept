package Automation.Singelton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverObject {
    public static WebDriver driver;


    public DriverObject() {

    }

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
            return driver;
        } else {
            return driver;
        }
    }
}
