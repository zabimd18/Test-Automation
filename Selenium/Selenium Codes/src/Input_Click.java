import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_Click {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("How to identify chinese faces");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(2000);
		String responce=driver.findElement(By.id("resultStats")).getText();
		System.out.println(responce);
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("In China")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}
