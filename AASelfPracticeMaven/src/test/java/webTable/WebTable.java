package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement webtab = driver.findElement(By.xpath("(//div[@class='w3-example'])[1]"));
	List<WebElement> tb = driver.findElements(By.tagName("tbody"));
	List<WebElement> allRow = driver.findElements(By.tagName("tr"));
	for(WebElement row:allRow)
	{
		List<WebElement> cells = driver.findElements(By.tagName("th"));
		for (WebElement cell : cells) 
		{
			System.out.print(" "+cell.getText());
			
			
			
		}
		System.out.println();
	}
	
}
}

