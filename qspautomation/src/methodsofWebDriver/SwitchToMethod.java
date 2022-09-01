package methodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.google.com/");
	Driver.switchTo().activeElement().sendKeys("design of machine element",Keys.ENTER);
	
	

	}

}
