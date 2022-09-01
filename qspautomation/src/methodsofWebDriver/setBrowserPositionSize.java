package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setBrowserPositionSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension targetSize=new Dimension(700,400);
		Point targetPosition=new Point(200,300);

		driver.manage().window().setSize(targetSize);
		driver.manage().window().setPosition(targetPosition);

	}

}
