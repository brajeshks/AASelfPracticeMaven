package selfPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleHtmlXpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Me\\eclipse-workspace\\AASelfPracticeMaven\\sampleHtml\\Sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='y']/ancestor::div[@name='D']/preceding-sibling::div[@name='A']//input[@name='m']"));
		Thread.sleep(3000);
		txtbox .sendKeys("anggg");
	}

}