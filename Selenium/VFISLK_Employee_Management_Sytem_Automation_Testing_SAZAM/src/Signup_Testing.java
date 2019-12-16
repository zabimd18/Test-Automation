import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Signup_Testing {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		driver.findElement(By.xpath("//*[contains(text(),'Sign up')]")).click();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		System.out.print("Checking if the signup page opens or not : ");
		if (Title.equals("SignUp"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		//----------------------------------------------------------------------
		System.out.print("Checking SignUp functionality for Correct data input : ");
		driver.findElement(By.name("userName")).sendKeys("mayuresh");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("password1")).sendKeys("123");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("E:\\Signup01.png"));
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[4]/input")).click();
		Thread.sleep(1000);
		Title=driver.getTitle();
		if (Title.equals("Login Module"))
		{
			System.out.println("Pass");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\Signup02.png"));
		}
		else
			System.out.println("Fail");
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		Files.copy(source1, new File("E:\\Signup03.png"));
		//----------------------------------------------------------------------
		driver.navigate().to("http://localhost:8090/Employee_Management_System/signup.jsp");
		System.out.print("Checking SignUp functionality for Wrong pass and re-type pass : ");
		driver.findElement(By.name("userName")).sendKeys("ms");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("password1")).sendKeys("321");
		TakesScreenshot ts11 = (TakesScreenshot)driver;
		File source11 = ts11.getScreenshotAs(OutputType.FILE);
		Files.copy(source11, new File("E:\\Signup03.png"));
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[4]/input")).click();
		Thread.sleep(1000);
		Title=driver.getTitle();
		if (Title.equals("Error Page"))
		{
			System.out.println("Pass");
			TakesScreenshot ts2 = (TakesScreenshot)driver;
			File source2 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source2, new File("E:\\Signup04.png"));
		}
		else
			System.out.println("Fail");
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE);
		Files.copy(source3, new File("E:\\Signup04.png"));
		//----------------------------------------------------------------------
		driver.navigate().to("http://localhost:8090/Employee_Management_System/signup.jsp");
		System.out.print("Checking Go back to login page button functionality : ");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/a")).click();
		Thread.sleep(1000);
		Title=driver.getTitle();
		if (Title.equals("Login Module"))
		{
			System.out.println("Pass");
			TakesScreenshot ts5 = (TakesScreenshot)driver;
			File source5 = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source5, new File("E:\\Signup05.png"));
		}
		else
			System.out.println("Fail");
		TakesScreenshot ts5 = (TakesScreenshot)driver;
		File source5 = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source5, new File("E:\\Signup05.png"));
		driver.quit();

	}

}
