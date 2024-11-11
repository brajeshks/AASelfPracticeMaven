package youtubeLectSelf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLlocaters {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	WebElement c = driver.findElement(By.className("nav-line-2"));
	c.click();
	driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("560076");
	driver.findElement(By.className("a-button-input")).click();

	driver.findElement(By.id("ap_email")).sendKeys("8285200175");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Brajesh@123");
	driver.findElement(By.id("signInSubmit")).click();
	
}
}
