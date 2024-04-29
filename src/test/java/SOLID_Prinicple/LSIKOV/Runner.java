package SOLID_Prinicple.LSIKOV;

import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.getClass());
        rec.area(2,4);


    }
}
