package com.codemind.project;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	private static String option;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Bhosale\\Desktop\\seleniumjava4.3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		return driver;
		
	}
	public static void selectValueFromDropdown1(WebElement element, String option) 	{
		Select select= new Select (element);
		select.selectByVisibleText(option);

	}
	public static void selectDateFromDatePicker(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	public static void scrollIntoView(WebElement element, WebDriver driver1) {

		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void clickUsingJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

}
	public static void selectValueFromDropdown(WebElement select, String string) {
		// TODO Auto-generated method stub
		
	}
}
