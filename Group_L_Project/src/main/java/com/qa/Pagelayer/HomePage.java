package com.qa.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	public HomePage()
	{
		PageFactory.initElements( Driver , this);
	}
	
	@FindBy(xpath="")
	private WebElement Cancel_btn;
	public void clickOnCancel_btn() 
	{
		Cancel_btn.click();
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_box;
	public void clickOnSearchbox(String phone) 
	{
		//search_box.click();
	    search_box.sendKeys(phone);
	}
	/*@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement oneplus;
	public void clickOnOneplus() 
	{
		oneplus.click();
	}
	*/
	}
