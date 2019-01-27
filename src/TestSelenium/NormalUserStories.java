package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalUserStories {
  @Test
  public void UserBuyProduct() {
	  System.setProperty("webdriver.chrome.driver",
              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
      WebDriver driver = new ChromeDriver();
      //driver.manage().window().maximize();
      driver.get("http://localhost:8080/welcome");
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("user@gmail.com");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("user");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a")).click();
      driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[6]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("2");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("Saqqara");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/div/a[1]")).click();
      driver.findElement(By.xpath("/html/body/a")).click();
      
  }
  
  @Test
  public void UserCancelPurchase(){
	  System.setProperty("webdriver.chrome.driver",
              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
      WebDriver driver = new ChromeDriver();
      //driver.manage().window().maximize();
      driver.get("http://localhost:8080/welcome");
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("user@gmail.com");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("user");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a")).click();
      driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[6]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("2");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("Saqqara");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/div/a[2]")).click();
      driver.findElement(By.xpath("/html/body/a")).click();
  
  }
  
}
