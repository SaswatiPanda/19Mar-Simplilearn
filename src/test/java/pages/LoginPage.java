package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import tests.BaseClass;

public class LoginPage extends BaseClass {
	

	WebDriver driver = BaseClass.driver;
	
	//============== Web Elements =========================
	
	@FindBy(className= "login")
	WebElement LoginLink;
	
	@FindBy(name= "user_login")
	WebElement UserName;
	
	@FindBy(id= "password")
	WebElement Password;
	
	@FindBy(className= "rememberMe")
	WebElement RememberMe;
	
	@FindBy(name= "btn_login")
	WebElement LoginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//================ Functions ============================
	
	public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on link","Link clicked successfully");
		
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter Username","Name entered successfully");
		
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password","Password entered successfully");
		
		RememberMe.click();
		test.log(LogStatus.PASS, "Click on Remember Me","Link clicked successfully");
		
		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on Login button","Link clicked successfully");
	}


}
