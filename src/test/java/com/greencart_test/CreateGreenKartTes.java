package com.greencart_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.greencart_page.CreateGreenKartPage;

import BaseTest.BaseTest;

public class CreateGreenKartTes extends BaseTest {
	
	
WebDriver driver;
	
	

	@BeforeTest
	public void init() throws InterruptedException {

		//driver= openApp();
		driver=openChrome();
		//driver=openEdge();
		//driver= openFirefox();
	}

	@Test
	public void addToCard() throws InterruptedException {

		CreateGreenKartPage a = new CreateGreenKartPage(driver);
		a.getBrocolli();
		a.getCauliflower();
		a.getBeans();
		a.getCapsicum();
		a.getMushroom();
		a.getPomegranate();
	}

	@Test
	public void click() throws InterruptedException {

		CreateGreenKartPage g = new CreateGreenKartPage(driver);
		g.getGreenAdd();
		g.CheckOut();
		g.getPromoCode();
		g.getApply();
		g.getPlaceOrder();
		g.getSelesctButton("Algeria");
		g.getCheckbox();
		g.getProcced();
		
	}
	

}
