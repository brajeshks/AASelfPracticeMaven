package tutorialsPoint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPointFormFill {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("Brajesh");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("gender")).click();
	driver.findElement(By.id("mobile")).sendKeys("9876543210");
	driver.findElement(By.id("dob")).sendKeys("01-04-1997");
	/*WebElement dob = driver.findElement(By.id("dob"));
	dob.click();*/
	driver.findElement(By.id("hobbies")).click();
	WebElement img = driver.findElement(By.xpath("//input[@id='picture']"));
	Thread.sleep(3000);
	img.click();
}
}
