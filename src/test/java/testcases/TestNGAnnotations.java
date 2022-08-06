package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	WebDriver driver;

	@BeforeSuite // alltestcases
	public void beforeSuite ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Bhosale\\Desktop\\seleniumjava4.3\\chromedriver_win32\\chromedriver.exe");
         this.driver= new ChromeDriver ();
 		driver.get("https://demoqa.com/automation-practice-form");

	}
	@AfterSuite
	public void afterSuite ()
	{
		System.out.println("after Suite");
	}
     @BeforeTest
     public void beforeTest ()
     {
    	 System.out.println("before test plan");
     }
     @AfterTest
     public void afterTest ()
     {
    	 System.out.println("after test plan");
     }
     @BeforeClass
     public void beforeclass ()
     {
    	 System.out.println("before class");
     }
     @AfterClass
     public void afterClass ()
     {
    	 System.out.println("After class");
     }
     @BeforeMethod // testcases
     public void beforeMethod ()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Bhosale\\Desktop\\seleniumjava4.3\\chromedriver_win32\\chromedriver.exe");
         this.driver= new ChromeDriver ();
 		driver.get("https://demoqa.com/automation-practice-form");
    	 
     }
     @AfterMethod
     public void afterMethod ()
     {
    	 System.out.println("after method");
    	 driver.quit();
    	 
     }
     @Test
 	
 	public void Annotations1()
 	{
 		System.out.println("this is testng test 1");
 		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("fName");
 		
 	}
     
     @Test
     public void Annotations2()
     {
    	 System.out.println("This is test ng test case 2");
  		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lName");

     }

}
