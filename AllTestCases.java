package XeroTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllTestCases {

	private static testCase1A{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
	}
	
	private static testCase1B{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@3");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
	}
	
	private static testCase1C{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyalppa@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
	}
	
	private static testCase1D{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);
		
		WebElement forgetPassword = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		forgetPassword.click();
		
		WebElement emialAddress = driver.findElement(By.xpath("//input[@id='UserName']"));
		emialAddress.sendKeys("kdeepthiyallappa@gmail.com");
		
		WebElement sendlink = driver.findElement(By.xpath("//a[@class='x-btn blue']"));
		sendlink.click();
	}
	
	private static testCase2A{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(5000);
		
		WebElement trailIcon = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		trailIcon.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
		firstName.sendKeys("krish");
		
		WebElement lastName = driver.findElement(By.name("LastName"));
		lastName.sendKeys("S");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		emailAddress.sendKeys("deepthi.krishnadeepthi@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		phoneNumber.sendKeys("3158792828");
		
		WebElement selectMenu = driver.findElement(By.xpath("//select[@name='LocationCode']"));
		Select select = new Select(selectMenu);
		select.deselectByVisibleText("United States");
		
		Thread.sleep(5000);
		WebElement termsAndPolicy = driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		termsAndPolicy.click();
		
		WebElement getStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getStarted.click();
	}
	
	private static testCase2B{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(5000);
		
		WebElement trailIcon = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		trailIcon.click();
		
		
		WebElement getStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getStarted.click();
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		emailAddress.sendKeys("deepthi.krishnadeepthi.com");
		
		WebElement getStartedAgain = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getStartedAgain.click();
		
	}
	
	private static testCase2C{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(5000);
		
		WebElement trailIcon = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		trailIcon.click();
	
		WebElement useLinks = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		useLinks.click();
		
		WebElement policyLinks = driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		policyLinks.click();
	}
	
	private static testCase2D{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(5000);
		
		WebElement trailIcon = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		trailIcon.click();
	
		WebElement offerDetailLink = driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		offerDetailLink.click();
		
	}
	
	private static testCase2E{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(5000);
		
		WebElement trailIcon = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		trailIcon.click();
	
		WebElement accountOrBook = driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		accountOrBook.click();
	}
	
	private static testCase3A{ //pending
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		
		WebElement dashboard = driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		dashboard.click();
		
		Thread.sleep(5000);
		WebElement switchToButton = driver.findElement(By.xpath("//button[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-open']"));
		Actions switchToAction = new Actions(driver);
		switchToAction.moveToElement(switchToButton).build().perform();
		
	}
	
	private static testCase4A{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		
		WebElement userMenu = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-3']"));
		userMenu.click();
		
		WebElement logoutButton = driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
		logoutButton.click();
		
		String text = driver.findElement(By.xpath("//input[@id='email']")).getText();
		String givenString = "kdeepthiyallappa@gmail.com";
		if(text == givenString) {
			System.out.println("Text is matching with the givenString");
		}else {
			System.out.println("Text is NOT matching with the givenString");
		}
	}
	
	private static testCase6A{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		
		WebElement userMenu = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-3']"));
		userMenu.click();
		
		WebElement usernameMenu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[5]/div[1]/div[2]/div[1]/ol[1]/li[1]/a[1]/h4[1]"));
		usernameMenu.click();
		
		WebElement uploadImages = driver.findElement(By.xpath("//div[@id='button-1041']"));
		uploadImages.click();
		
		WebElement browseButton = driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"));
		browseButton.sendKeys("/Users/krishnayallappa/Desktop/pic1.png");
		
		WebElement uploadButton = driver.findElement(By.xpath("//div[@id='button-1178']"));
		uploadButton.click();
	}
	
	private static testCase8A{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("kdeepthiyallappa@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Deepthi@312");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		
		WebElement myXero = driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
		myXero.click();
		
		WebElement organization = driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"));
		organization.click();
		
		Thread.sleep(3000);
		WebElement organizationName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		organizationName.sendKeys("UNA");
		
		WebElement payTaxesMenu = driver.findElement(By.xpath("//body[@class='xui-body xui-background-white']/div[@id='root']/div/div/div[@class='xui-page-width-standard xui-u-flex xui-u-flex-justify-center padding-top-large__2ARN9']/div[@class='margin-bottom-large__3eVb7 xui-panel']/div[@class='panel-width-max__3nkEZ xui-panel--section']/form[@class='xui-form-layout']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		Select select = new Select(payTaxesMenu);
		select.selectByVisibleText("United States");
		
		Thread.sleep(3000);
		
		WebElement timeZoneMenu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		Select select1 = new Select(timeZoneMenu);
		select1.selectByIndex(6);
		
		WebElement organizationdo = driver.findElement(By.xpath("//input[@id='de35fcf7-7306-48bb-9b2c-a312f40e5937-control']"));
		organizationdo.sendKeys("Engineering");
		
		WebElement softwareMenu = driver.findElement(By.xpath("//button[@class='xui-button xui-select--button xui-select--button-no-variant xui-textcolor-faint xui-button-standard xui-button-medium xui-button-fullwidth']"));
		Select select2 = new Select(softwareMenu);
		select2.selectByVisibleText("Wave");
		
		WebElement startTrail = driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']"));
		startTrail.click();
	}
	
	
	public static void main(String[] args) {


	}

}
