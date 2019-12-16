import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//input[@id='srchword' and @name='srchword']")).sendKeys("lenovo");
		driver.findElement(By.xpath("//input[@class='newsrchbtn']")).click();
	}

}
