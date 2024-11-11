package multipleWindowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAParticularWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		for(int i=1;i<10;i++)
		{
			driver.switchTo().newWindow(WindowType.WINDOW);
		}
		Set<String> wids = driver.getWindowHandles();
		System.out.println("Number Of Open Windows: "+wids.size());
		
		
		ArrayList<String> list = new ArrayList(wids);
		System.out.println(list);
		driver.switchTo().window(list.get(6));
		driver.close();
		
		System.out.println("Close 7th Window with wid: "+list.get(6));
		driver.quit();
	}
}
