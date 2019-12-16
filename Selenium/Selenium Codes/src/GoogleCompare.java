import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCompare {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String search="How to identify chinese faces";
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).submit();
		Thread.sleep(2000);
		String nextpage=driver.findElement(By.name("q")).getAttribute("value");
		if(search.equals(nextpage))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Expected Result"+search);
		}
		driver.close();
	}

}
