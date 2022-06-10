package com.hrmfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HRMfactory {
	WebDriver driver;

	public HRMfactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}
	@FindBy(how = How.NAME, using = "Submit")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	@FindBy(how = How.ID, using = "welcome")
	private WebElement welcomeTxt;

	public WebElement getWelcomeTxt() {
		return welcomeTxt;
	}

	public void setWelcomeTxt(WebElement welcomeTxt) {
		this.welcomeTxt = welcomeTxt;
	}
}

