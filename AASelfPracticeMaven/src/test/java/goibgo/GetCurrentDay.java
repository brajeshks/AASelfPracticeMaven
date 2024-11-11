package goibgo;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentDay {
	public static void main(String[] args) {
        // Set path to chromedriver.exe
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Get current system date
        LocalDate currentDate = LocalDate.now();

        // Convert day of the week to a string format
        String currentDay = currentDate.getDayOfWeek().toString();

        try {
            // Open a website
            driver.get("https://www.example.com");

            // Print the current day
            System.out.println("Current day is: " + currentDay);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

