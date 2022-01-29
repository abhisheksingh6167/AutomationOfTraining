package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class expedi {
	
	
		public WebDriver driver;
		
		@FindBy(xpath="//a[@aria-controls='wizard-flight-pwa']") WebElement flights;
		@FindBy(xpath="//button[@aria-label='Leaving from']") WebElement from;
		@FindBy(xpath="//button[@aria-label='Going to']") WebElement to;
		@FindBy(xpath="//button[@data-testid='submit-button']") WebElement search;
		@FindBy(xpath="//span[@class='uitk-flex-item']") WebElement round;		
		@FindBy(xpath="//span[@class='uitk-menu-list-item-label']") WebElement roundtr;
		@FindBy(xpath="//button[@data-test-id='select-link'][2]") WebElement firstfl;
		@FindBy(xpath="//button[@aria-label='Select Basic Economy for $200']") WebElement thisfl;
		@FindBy(xpath="//button[@data-test-id='select-link'][5]") WebElement nextfl;
		@FindBy(xpath="//button[@aria-label='Select Basic Economy for $206']") WebElement nowfl;
		@FindBy(xpath="//button[@data-test-id='goto-checkout-button") WebElement anotherfl;
		@FindBy(id="firstname[0]") WebElement fname;
		@FindBy(id="lastname[0]") WebElement lname;
		@FindBy(id="phone-number[0]") WebElement phone;
		@FindBy(id="gender_male[0]") WebElement gender;
		@FindBy(xpath="//select[@data-rfrr-validation-error='air.pref[0].dateOfBirth.month']") WebElement month;
		@FindBy(xpath="//select[@data-rfrr-validation-error='air.pref[0].dateOfBirth.day']") WebElement day;
		@FindBy(xpath="//select[@data-rfrr-validation-error='air.pref[0].dateOfBirth.year']") WebElement year;
		//data-rfrr-validation-error='air.pref[0].dateOfBirth.month'
		//data-rfrr-validation-error='air.pref[0].dateOfBirth.day'
		//data-rfrr-validation-error='air.pref[0].dateOfBirth.year'
		//gender_male[0]
		//button aria-label='Select Basic Economy for $200'
		//button[@data-test-id="select-link"][2]
		//data-test-id="goto-checkout-button"
		//uitk-menu-list-item-label
		
	public expedi(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	public void flight(){
		
		flights.click();
		}

public void fromm(){
	
	from.sendKeys("dca");
	from.sendKeys(Keys.DOWN);
	from.sendKeys(Keys.RETURN);
		
		
		}



public void too(){
	
	from.sendKeys("seattle");
	from.sendKeys(Keys.DOWN);
	from.sendKeys(Keys.RETURN);
}



public void searcho(){
	search.click();
	
}

public void roundo(){
	round.click();
	
	
}

public void roundt(){
	
	roundtr.click();
	
	
}

public void flo(){
	
	firstfl.click();
	
	
}

public void flt(){
	
	thisfl.click();
	
	
}

public void flthree(){
	
	nextfl.click();
	
	
}

public void flfour(){
	
	nowfl.click();
	
	
}
public void flfive(){
	anotherfl.click();
	
	
}
public void firstname(){
	fname.sendKeys("abc");
	
	
}
public void lastname(){
	lname.sendKeys("abcde");
	
	
}
public void phoneNumber(){
	phone.sendKeys("12345");
	
	
}
public void genderMale(){
	gender.click();
	
	
}

public void bdayMonth(){
	month.click();
	

	month.sendKeys("10");
	month.sendKeys(Keys.RETURN);
	
}

public void bdayDay(){

	day.click();
	

	day.sendKeys("12");
	day.sendKeys(Keys.RETURN);
	
	
}
public void bdayYear(){
	year.click();
	

	year.sendKeys("1992");
	year.sendKeys(Keys.RETURN);
	
	
}



	}


}
