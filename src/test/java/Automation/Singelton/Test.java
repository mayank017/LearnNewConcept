package Automation.Singelton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Test {
    static WebDriver driver1;
    static WebDriver driver2;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver1 = DriverObject.getInstance();
        driver2 = DriverObject.getInstance();
        driver1.get("https://google.com");
        driver1.get("https://facebook.com");

        System.out.println(driver1);
        System.out.println(driver2);
    }
}
