package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class go_to_amazon {

    public static WebDriver driver; // Variable estática para compartir la instancia de WebDriver

    @Test
    public void goToAmazon() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver.manage().window().maximize();
        driver = new ChromeDriver(options);
        driver.get("https://amazon.com");
    }

}
