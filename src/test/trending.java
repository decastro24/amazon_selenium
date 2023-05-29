package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class trending {
	private WebDriver driver;
	private List<WebElement> products;
	
	
	@Test
	public void trendProducts() throws InterruptedException {
		driver = go_to_amazon.driver;
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(Duration.ofSeconds(3));
		String trendingProducts = "div[class='s-suggestion-trending s-suggestion-ellipsis-direction']";
        products = driver.findElements(By.cssSelector(trendingProducts));
		for (int i =0; i<products.size(); i++) {
			WebElement product = products.get(i);
			System.out.println("product " + (i + 1) + ": " + product.getText());	
		}		
	}
	
	@Test(dependsOnMethods = "trendProducts")
	public void GetTrendProducts() throws InterruptedException {
	        WebElement product = products.get(1);
	        product.click();
	        Thread.sleep(Duration.ofSeconds(3));
	        WebElement element = driver.findElement(By.id("search"));
	        File screenshot = element.getScreenshotAs(OutputType.FILE);
	        String screenshotPath = "C:\\Users\\50052301\\Documents\\demo\\product.png";
	        try {
	            FileUtils.copyFile(screenshot, new File(screenshotPath));
	            System.out.println("Captura de pantalla del elemento guardada en: " + screenshotPath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}