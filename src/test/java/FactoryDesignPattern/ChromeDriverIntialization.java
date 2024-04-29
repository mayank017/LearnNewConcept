package FactoryDesignPattern;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverIntialization implements WebDriverIntialization {
    WebDriver driver;

    public void ChromeDriverIntialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Override
    public void getUrl(String url) {
        driver.get(url);
    }
}
