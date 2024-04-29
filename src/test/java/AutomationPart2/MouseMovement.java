package AutomationPart2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        Actions act = new Actions(driver);
        while (true) {
            act.moveToElement(driver.findElement(By.xpath("//textarea[@class='gLFyf']"))).build().perform();
            act.moveToElement(driver.findElement(By.xpath("//div[@class='gb_K gb_L'][1]"))).build().perform();
        }
    }

    public void method1(String s) {

    }
    public void method1(int s) {

    }
}
