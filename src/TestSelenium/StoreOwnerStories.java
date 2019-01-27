package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StoreOwnerStories {

	@Test 
	 public void OwnerSuggestStoreStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe"); 
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh WebDriver driver
		WebDriver driver= new ChromeDriver(); //driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome"); //Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click(); 
		//suggest store story and then logout
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"storeName\"]")).sendKeys("FCB_Store");
		driver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("Catalonia");
		driver.findElement(By.xpath("//*[@id=\"storeType1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ownerID1\"]")).click();
		driver.findElement(By.xpath("/html/body/div/form/p[5]/input")).click();
		driver.findElement(By.xpath("/html/body/a")).click();
	  
	  }

	@Test public void OwnerSuggestProductStory(){
		System.setProperty("webdriver.chrome.driver",
			  "D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe"); 
	  	// B3rf object mn el Browser ely 3ayez ashta3'l 3leh WebDriver driver
	  	WebDriver driver= new ChromeDriver(); //driver.manage().window().maximize();
	  	driver.get("http://localhost:8080/welcome"); //Store Owner Sigh In
	  	driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click(); 
	  	driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
	  	driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
	  	driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
	  	//Suggest Product For the Store
	  	driver.findElement(By.xpath("/html/body/table/tbody/tr/td[4]/a")).click(); 
	  	driver.findElement(By.xpath("//*[@id=\"productName\"]")).sendKeys("T-Shirt"); 
	  	driver.findElement(By.xpath("//*[@id=\"price\"]")).clear();
	  	driver.findElement(By.xpath("//*[@id=\"price\"]")).sendKeys("100");
	  	driver.findElement(By.xpath("//*[@id=\"quantity\"]")).clear();
	  	driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("10");
	  	driver.findElement(By.xpath("//*[@id=\"productType2\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"category2\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"storeID\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"storeID\"]/option[1]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"brandID\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"brandID\"]/option[1]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"ownerID1\"]")).click();
	  	driver.findElement(By.xpath("/html/body/div/form/p[9]/input")).click();
	  	driver.findElement(By.xpath("/html/body/a")).click();
	  }

	@Test
	public void EditProductStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome");
		// Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
		// Edit Product From the Store
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[7]/a")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]/input")).sendKeys("T-Shirt");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Clothes");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[3]/input")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[4]/input")).clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[4]/input")).sendKeys("150");
		driver.findElement(By.xpath("/html/body/form/p/input")).click();
	}

	@Test
	public void DeleteProductStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome");
		// Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
		// Delete Product From the Store
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[8]/a")).click();

	}

	@Test
	public void SeeStatisticsStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome");
		// Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
		// See Statistics of the Store
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[5]/a")).click();
	}

	@Test
	public void SeeActionsStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome");
		// Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
		// See Actions of the Store
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[6]/a")).click();

	}

	@Test
	public void AddCollaboratorStory() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FCI\\3rd year\\2nd Term\\Software Engineering - 2\\Assignment\\Ass_2\\chromedriver.exe");
		// B3rf object mn el Browser ely 3ayez ashta3'l 3leh
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://localhost:8080/welcome");
		// Store Owner Sigh In
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/form/p[1]/input")).sendKeys("owner@gmail.com");
		driver.findElement(By.xpath("/html/body/form/p[2]/input")).sendKeys("owner");
		driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
		// Add Collaborator of the Store
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Mahmoud");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("collaborator@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("collaborator");
		driver.findElement(By.xpath("//*[@id=\"age\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("40");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Spain");
		driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("01501201111");
		driver.findElement(By.xpath("/html/body/form/p[8]/input")).click();

	}
}
