package brokenLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		// get bacground color
		String rgbBackgroundcol = loginButton.getCssValue("background-color");
		System.out.println(rgbBackgroundcol);
		String hexadecimalValue = Color.fromString(rgbBackgroundcol).asHex();
		System.out.println(hexadecimalValue);
		driver.manage().window().minimize();
		//driver.quit();
	}

}
