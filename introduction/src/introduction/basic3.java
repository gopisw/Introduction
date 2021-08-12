package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class basic3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
		/*driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("9966982276");
		driver.findElement(By.name("pass")).sendKeys("gladiator");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
	}

}
