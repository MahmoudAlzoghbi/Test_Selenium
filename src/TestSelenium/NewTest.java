package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void TestAy7aga() {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8080/welcome");
	}
}
