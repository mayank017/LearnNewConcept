package FactoryDesignPattern;

public class FactoryClass {
    public static WebDriverIntialization createIsnatnce(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeDriverIntialization();
            case "firefox":
                return new FireFoxDriverIntilization();
        }
        return null;
    }
}
