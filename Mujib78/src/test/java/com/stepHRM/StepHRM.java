package com.stepHRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.hrmfactory.HRMfactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepHRM {	

	WebDriver driver;
	//HRMfactory obj;
	
	@Given("^User go to orange HRM home page$")
	public void user_go_to_orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
  		 driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	//obj=new HRMfactory(driver);
	   
	}

	@When("^User type the username$")
	public void user_type_the_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		  //obj.getUsername().sendKeys("Admin"); 
	   
	}

	@When("^User also type the password$")
	public void user_also_type_the_password() throws Throwable {
		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");   
		  // obj.getPassword().sendKeys("admin123");  
	   
	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click(); 
		   //obj.getLoginBtn().click(); 
	   
	}

	@Then("^User varify the welcome page$")
	public void user_varify_the_welcome_page() throws Throwable {
		String expect = "Welcome";
		String actual = driver.findElement(By.id("welcome")).getText();
		//String actual=obj.getWelcomeTxt().getText();
		Assert.assertTrue("welcome message is not found", actual.contains(expect));
	   
	}

}