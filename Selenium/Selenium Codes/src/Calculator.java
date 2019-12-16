import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).sendKeys("10000");
		
		driver.findElement(By.id("downpayment")).sendKeys("1520");
		driver.findElement(By.id("loanamt")).clear();
		driver.findElement(By.id("loanamt")).sendKeys("246543");
		driver.findElement(By.name("cal")).click();
		String a=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println(a);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
