package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeLogin {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Flib flib = new Flib();
		String username = flib.readExcelData("./data/TestDataActi.xlsx","validcreds",1,0);
		String password = flib.readExcelData("./data/TestDataActi.xlsx","validcreds",1,1);
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);//for orangeHrm
		driver.findElement(By.name("txtPassword")).sendKeys(password);

		driver.findElement(By.id("btnLogin")).click();





	}

}