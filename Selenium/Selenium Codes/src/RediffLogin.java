import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String Title="REDIFF.COM";
		if(driver.getTitle().equals(Title))
		{
			System.out.println("Pass Title Mached");
		}
		else
		{
			System.out.println("Fail Expected Result is "+Title);
		}
		driver.findElement(By.className("signin")).click();
		String Logintitle=driver.getTitle();
		if(Logintitle.equals("Rediffmail"))
		{
			System.out.println("Login page displayed");
		}
		else
		{
			System.out.println("Login page Failed");
		}
		String username="akshaychavan";
		String password="aksha@chavan";
		
		driver.findElement(By.id("login1")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("remember")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("proceed")).click();
		String Error=driver.getTitle();
		if(Error.equals("Rediffmail NG-Login Error"))
		{
			System.out.println("Error Page Displayed");
		}
		else
		{
			System.out.println("Error Page not Displayed");
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
