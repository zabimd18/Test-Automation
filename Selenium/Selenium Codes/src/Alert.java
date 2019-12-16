import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='#CancelTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello i am Alert Box");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
		
		}

}
