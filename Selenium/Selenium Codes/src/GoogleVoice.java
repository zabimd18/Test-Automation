import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVoice {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/doodles");
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		driver.findElement(By.xpath("//ul[@class='thumb-image']/a]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
