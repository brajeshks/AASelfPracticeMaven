package goibgo;

import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibgoBookTicketMon {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();

		
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

		LocalDate CurrentDate = LocalDate.now();
		String currentDay = CurrentDate.getDayOfWeek().toString();
		System.out.println(currentDay);

		WebElement dayElement = driver.findElement(By.xpath("//p[@class='sc-12foipm-5 bwPbmr']"));
		String dayText = dayElement.getText();

		// Print the day
		System.out.println("Current day on Goibibo: " + dayText);

		driver.findElement(By.xpath("//span[@class='sc-12foipm-70 fPPRk']//following-sibling::p[text()='One-way']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='sc-12foipm-69 icpyTV']//following-sibling::p[text()='Round-trip']")).click();
        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='sc-12foipm-69 ivuLpM']/span[@class='sc-12foipm-70 fPPRk']")).click();

	}

}
