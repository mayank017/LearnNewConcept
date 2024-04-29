package FactoryDesignPattern;

public class Runner {
    public static void main(String[] args) {
        WebDriverIntialization driver = FactoryClass.createIsnatnce("chrome");
        driver.getUrl("https:.");

    }
}
