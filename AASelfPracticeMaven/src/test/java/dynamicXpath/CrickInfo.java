package dynamicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfo {
public static void main(String[] args) {
	
		
		
			String playerName = "Ravindra Jadeja";	
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/100265/ind-vs-nz-1st-test-new-zealand-tour-of-india-2024");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			String score = driver.findElement(By.xpath("//a[contains(@title,'"+playerName+"')and @class='cb-text-link']/parent::div[@class='cb-col cb-col-25 text-bold']/following-sibling::div[@class='cb-col cb-col-8 text-right text-bold']")).getText();
	        System.out.println(playerName+" "+score);
	        driver.quit();
		}
}
