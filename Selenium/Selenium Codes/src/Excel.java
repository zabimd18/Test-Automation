import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Excel {

	public static int xlRows;
	public static int xlCols;
	public static String[][] xData;

	public static void main(String[] args) throws Exception {
		xlRead("E:\\Google.xls");
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		for (int i = 1; i < xlRows; i++) {
			if(xData[i][1].equalsIgnoreCase("Y"))
			{
			String vSearch = xData[i][0];
			driver.findElement(By.name("q")).sendKeys(vSearch);
			Thread.sleep(2000);
			driver.findElement(By.name("btnK")).click();
			Thread.sleep(2000);
			xData[i][3] = driver.getTitle();
			if(xData[i][2].equals(xData[i][3]))
			{
				xData[i][4]="Pass";
			}
			else
			{
				xData[i][4]="Fail";
			}
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String location= "E:\\Excelreadwrite\\Screen"+i+".png";
			Files.copy(source, new File(location));
			xData[i][5]=location;
			driver.navigate().back();
			Thread.sleep(2000);
			}
		}
		xlwrite("E:\\Googleresult.xls", xData);
		driver.quit();
	}

	public static void xlRead(String sPath) throws Exception {
		File myFile = new File(sPath);
		FileInputStream myStream = new FileInputStream(myFile);
		HSSFWorkbook myworkbook = new HSSFWorkbook(myStream);
		HSSFSheet mySheet = myworkbook.getSheetAt(0);
		xlRows = mySheet.getLastRowNum() + 1;
		xlCols = mySheet.getRow(0).getLastCellNum();
		xData = new String[xlRows][xlCols];
		for (int i = 0; i < xlRows; i++) {
			HSSFRow row = mySheet.getRow(i);
			for (short j = 0; j < xlCols; j++) {
				HSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				xData[i][j] = value;
				System.out.print("-" + xData[i][j]);
			}
			System.out.println();
		}
	}

	public static String cellToString(HSSFCell cell) {
		int type = cell.getCellType();
		Object result;
		switch (type) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue();
			break;
		case HSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_FORMULA:
			throw new RuntimeException("We cannot evaluate formula");
		case HSSFCell.CELL_TYPE_BLANK:
			result = "-";
		case HSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
		case HSSFCell.CELL_TYPE_ERROR:
			result = "This cell has some error";
		default:
			throw new RuntimeException("We do not support this cell type");
		}
		return result.toString();

	}

	public static void xlwrite(String xlpath1, String[][] xData) throws Exception {
		System.out.println("Inside XL Write");
		File myFile1 = new File(xlpath1);
		FileOutputStream fout = new FileOutputStream(myFile1);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet mySheet1 = wb.createSheet("TestResults");
		for (int i = 0; i < xlRows; i++) {
			HSSFRow row1 = mySheet1.createRow(i);
			for (short j = 0; j < xlCols; j++) {
				HSSFCell cell1 = row1.createCell(j);
				cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
				cell1.setCellValue(xData[i][j]);
			}
		}
		wb.write(fout);
		fout.flush();
		fout.close();
	}

}
