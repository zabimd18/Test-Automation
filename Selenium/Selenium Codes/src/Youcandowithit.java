import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youcandowithit {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();				//Maximize Window
		driver.get("http://www.youcandealwithit.com/");		//Connect to website					
		String food="100";									//Define to be Entered values
		String clothing="150";
		String shelter="200";
		String monthlyincome="600";
		
		WebElement acc=driver.findElement(By.xpath("//*[@id='siteNav']/li/a"));	//Locate to Browsers
		Actions act=new Actions(driver);										//Mousehover Action
		act.moveToElement(acc).build().perform();
		driver.findElement(By.xpath("//*[contains(text(),'Calculators & Resources')]")).click();	//Click on Calculator and Resourses
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();				//Click on Calculators
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='indexNavList']/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("food")).sendKeys(food);
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys(clothing);
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys(shelter);
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys(monthlyincome);
		Thread.sleep(4000);
		String monthlyexpenses=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String totalmontlyincome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		double monthlyexpenses1=Double.parseDouble(monthlyexpenses);
		double totalmontlyincome1=Double.parseDouble(totalmontlyincome);
		if(monthlyexpenses1>totalmontlyincome1)
		{
			System.out.println("Think before Sepnd");
		}
		else
		{
			System.out.println("You are a Good Saver");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
