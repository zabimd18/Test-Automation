import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOperationv 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String a = input.next();
		if (a.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "E:\\TR soft\\Selenium Jars\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.co.in/");
			driver.close();
		}
		else 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
		}
	}

}
