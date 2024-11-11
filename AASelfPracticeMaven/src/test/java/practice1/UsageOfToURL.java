package practice1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToURL {
	public static void main(String[] args) throws MalformedURLException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/fr/services/lexique-bilingue/");

		URL mainUrl = new URL("https://www.dassault-aviation.com/fr/services/lexique-bilingue/");

		URL groupPageUrl = new URL(mainUrl,"groupe/");
		URL defensePageUrl = new URL(mainUrl,"defense/");
		URL civilPageUrl = new URL(mainUrl,"civil/");
		URL spacePageUrl = new URL(mainUrl,"espace/");
		URL passionPageUrl = new URL(mainUrl,"passion");

		Thread.sleep(3000);
		driver.navigate().to(defensePageUrl);

		Thread.sleep(3000);
		driver.navigate().to(passionPageUrl);

		Thread.sleep(3000);
		driver.navigate().to(civilPageUrl);

		Thread.sleep(3000);
		driver.navigate().to(groupPageUrl);

		driver.manage().window().minimize();
		driver.quit();
	}
}
