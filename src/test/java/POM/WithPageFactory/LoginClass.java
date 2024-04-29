package POM.WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
    WebDriver driver;

    public LoginClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "abcs") WebElement searctextbox;

    public  void searchinSearchTextbox(String text) {
        searctextbox.sendKeys(text);
    }
}
