package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codemind.project.Utility;

import pages.HomePage;
import com.codemind.project.Utility;




public class HomePageTestCases {
	


	HomePage homePage;
	WebDriver driver;

	@BeforeClass
	public void launchUrl() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}

	@Test
	public void verifyFormFiledSelection() {
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName");
		homePage.setGenderRadioButton();
		// homePage.getGenderRadioButton().click();
		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
		homePage.setDateOfBirthInputField();
		Utility.scrollIntoView(homePage.getDateOfBirthInputField(), driver);
		homePage.getDateOfBirthInputField().click();

		WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility.selectValueFromDropdown(select,"2010");
		Utility.selectDateFromDatePicker(driver, "10");
	
	homePage.setHobbiesCheckBox();
	Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
    homePage.getHobbiesCheckBox().click();
    
    homePage.getFileUpload().sendKeys("C:\\Users\\Pooja Bhosale\\Desktop\\seleniumjava4.3\\chromedriver_win32\\chromedriver.exe");

    //This is home page
	}
	
	
	@AfterClass
	public void tearDown() {
	//driver.quit();
	}

}


	

	

	



