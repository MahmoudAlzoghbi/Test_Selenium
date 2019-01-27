package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class TestSignUp {
  @Test
  public void SignUpStory() {
	  System.setProperty("webdriver.chrome.driver",
              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
      WebDriver driver = new ChromeDriver();
      //driver.manage().window().maximize();
      driver.get("http://localhost:8080/welcome");
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Lio");
      driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Messi");
      driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Lio.Messi@admin.com");
      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("LioLio10");
      driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("31");
      driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Catalonia");
      driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("600600");
      driver.findElement(By.xpath("//*[@id=\"type1\"]")).click();
      driver.findElement(By.xpath("/html/body/form/p[9]/input")).click();
	  
  }
}
