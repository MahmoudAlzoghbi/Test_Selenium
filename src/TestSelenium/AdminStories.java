package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminStories {
  
	
	@Test
	public void AdminAddBrand() {
	  System.setProperty("webdriver.chrome.driver",
              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
      WebDriver driver = new ChromeDriver();
      //driver.manage().window().maximize();
      driver.get("http://localhost:8080/welcome");
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("admin@gmail.com");
      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("admin");
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a")).click();
      driver.findElement(By.xpath("//*[@id=\"brandName\"]")).sendKeys("COTTONIL");
      driver.findElement(By.xpath("//*[@id=\"brandCategory3\"]")).click();
      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
      driver.findElement(By.xpath("/html/body/a")).click();
  }
  
	@Test
	public void AdminAcceptStoresSuggested(){
		System.setProperty("webdriver.chrome.driver",
	              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
	      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
	      WebDriver driver = new ChromeDriver();
	      //driver.manage().window().maximize();
	      driver.get("http://localhost:8080/welcome");
	      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
	      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("admin@gmail.com");
	      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("admin");
	      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
	      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
	      driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[6]/a")).click();
	}
	
	@Test
	public void AdminAcceptProductSuggested(){
		System.setProperty("webdriver.chrome.driver",
	              "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
	      // B3rf object mn el Browser ely 3ayez ashta3'l 3leh
	      WebDriver driver = new ChromeDriver();
	      //driver.manage().window().maximize();
	      driver.get("http://localhost:8080/welcome");
	      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
	      driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("admin@gmail.com");
	      driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("admin");
	      driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
	      driver.findElement(By.xpath("/html/body/table/tbody/tr/td[4]/a")).click();
	      driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[8]/a")).click();
	}
}
