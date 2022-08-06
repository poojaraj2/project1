package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
         // this changes is from master
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement genderRadioButton;
	WebElement dateOfBirthInputField;
	WebElement hobbiesCheckBox;
	WebElement fileUpload;


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	}

	public WebElement getDateOfBirthInputField() {
		return dateOfBirthInputField;
	}

	public void setDateOfBirthInputField() {
		this.dateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}
	
		public WebElement getFileUpload() {
			this.fileUpload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
			return fileUpload;

		
		
	}

}
