package driver_ile_hedefe_gitme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driver_get {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        driver.get("https://amazon.com");

        driver.close();
    }
}