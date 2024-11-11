package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LerningCookies {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().addCookie(new Cookie("Brajesh", "tvtfty65k6vk7vcxc"));
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
        for(Cookie cookie:cookies)
        {
        	System.out.println(cookie);
        	System.out.println();
        }

        driver.quit();
	}
}
