package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class go_to_amazon {

    public static WebDriver driver; // Variable estática para compartir la instancia de WebDriver

    @Test
    public void goToAmazon() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\50052301\\Documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
    }

}
