package webTable;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		// initialize 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("(//div[@class='w3-example'])[1]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			List<WebElement> colums1 = row.findElements(By.tagName("th"));
			 for(WebElement column:colums1)
			 {
				 
				 System.out.print(column.getText() + "\t");
			 }
			 System.out.println(); 
			
			List<WebElement> colums = row.findElements(By.tagName("td"));
			 for(WebElement column:colums)
			 {
				 
				 System.out.print(column.getText() + "\t");
			 }
			 System.out.println(); 
		}

	}
}
