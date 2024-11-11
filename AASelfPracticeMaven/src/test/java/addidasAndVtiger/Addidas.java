package addidasAndVtiger;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Addidas {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.adidas.co.in/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		actions.scrollByAmount(1000, 1000).perform();
		
		driver.findElement(By.xpath("//div[@class='_tabs-container_13z70_6']"));
		for(int i=0;i<=3;i++)
		{
		List<WebElement> li = driver.findElements(By.xpath("//button[contains(@class,'_tab-button_13z70_14')]"));
		System.out.println(li);
		}
		

	}

}
