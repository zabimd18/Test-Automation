
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class ChromOperation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String expected="Google Home";
		if(driver.getTitle().equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			System.out.println("Expected Result "+expected);
		}
		
		driver.close();
		
	}

}
