package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.close();
		// TODO Auto-generated method stub

	}

}
