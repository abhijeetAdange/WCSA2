package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/OneDrive/Desktop/HTML/usernametextbox.html");
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input[id=text]")).sendKeys("admin");
		driver.findElement(By.cssSelector("Input[id=txtPassword]")).sendKeys("managaer");
		driver.findElement(By.cssSelector("input[id=btnLogin]"));
		

	}

}
