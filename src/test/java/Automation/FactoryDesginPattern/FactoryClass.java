package Automation.FactoryDesginPattern;

public class FactoryClass {
    public static DriverInterface getWebDriver(String browsername) {
        switch (browsername.toLowerCase()) {
            case "chrome":
                return new MyChromeDriver();
            case "firefox":
                return new MyFirefoxDriver();
        }
        return null;
    }
}
