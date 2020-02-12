package com.qa.pages;

public class HomePage<WebDriver> {
	
	
	 WebDriver driver;
	 
	public void test1()
	{
		System.out.println("Home page Elements");
	}
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		
		System.out.println("Constrector has been created");
	}

}
