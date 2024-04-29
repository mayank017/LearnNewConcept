package Automation.FactoryDesginPattern;

public class Runner {
    public static void main(String[] args) {
        DriverInterface chromeDriver = FactoryClass.getWebDriver("chrome");
        chromeDriver.get("https://facebook.com");

        DriverInterface firefoxDriver = FactoryClass.getWebDriver("firefox");
        firefoxDriver.get("https://facebook.com");
    }
}
