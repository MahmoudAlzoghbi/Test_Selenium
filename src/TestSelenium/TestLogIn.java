package TestSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogIn {
 
  @Test
  public void TestLogin(){
	// 3lshan asta5dem el-driver lazem a download el executable
      System.setProperty("webdriver.chrome.driver",
              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
      WebDriver driver = new ChromeDriver();
      // Da by5aly el window tafta7 kamla
      driver.manage().window().maximize();
      //driver.manage().deleteAllCookies();
      //driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
      //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MINUTES);

      driver.get("http://localhost:8080/welcome");
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("admi1n@gmail.com");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("admin1");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
  }
}
