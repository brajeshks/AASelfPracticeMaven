package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceIphon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		// WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 14
		// Pro (Deep Purple, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']"));
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Pro (Space Black, 512 GB)']/../..//div[@class='Nx9bqj _4b5DiR']"));
		System.out.println("price: " + price.getText());
		WebElement rating = driver.findElement(By.xpath("//div[@class='XQDdHH']"));
		System.out.println("Rating: " + rating.getText());
	}
}