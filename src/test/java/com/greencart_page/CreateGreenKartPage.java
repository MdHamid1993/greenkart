package com.greencart_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateGreenKartPage {

	WebDriver driver;

	public CreateGreenKartPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBrocolli() {

		for (int i = 1; i < 3; i++) {
			WebElement Brocolli = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/a[2]"));
			Brocolli.click();
		}
		WebElement Brocolli = driver.findElement(By.xpath("//*[text()='ADD TO CART']"));
		Brocolli.click();
		return Brocolli;
	}

	public WebElement getCauliflower() {

		for (int i = 1; i < 5; i++) {
			WebElement Cauliflower = driver.findElement(By.xpath("(//a[@class='increment'])[2]"));
			Cauliflower.click();
		}
		WebElement Cauliflower = driver.findElement(By.xpath("//div[@class='products']/div[2]/div[3]/button"));

		Cauliflower.click();
		return Cauliflower;

	}

	public WebElement getBeans() throws InterruptedException {
		Thread.sleep(2000);

		for (int i = 1; i < 4; i++) {
			WebElement Beans = driver.findElement(By.xpath("(//a[@class='increment'])[7]"));
			Beans.click();
		}
		WebElement Beans = driver.findElement(By.xpath("(//div[@class='products'])/div[7]/div[3]/button"));
		Beans.click();
		return Beans;

	}

	public WebElement getCapsicum() {
		for (int i = 1; i < 6; i++) {
			WebElement Capsicum = driver.findElement(By.xpath("(//a[@class='increment'])[9]"));
			Capsicum.click();
		}
		WebElement Capsicum = driver.findElement(By.xpath("(//div[@class='products'])/div[9]/div[3]/button"));
		Capsicum.click();
		return Capsicum;
	}

	public WebElement getMushroom() {

		for (int i = 1; i < 9; i++) {
			WebElement Mushroom = driver.findElement(By.xpath("(//a[@class='increment'])[10]"));
			Mushroom.click();
		}
		WebElement Mushroom = driver.findElement(By.xpath("(//*[text()='ADD TO CART'])[9]"));
		Mushroom.click();
		return Mushroom;

	}

	public WebElement getPomegranate() {
		for (int i = 1; i < 10; i++) {
			WebElement Pomegranate = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[22]/div[2]/a[2]"));
			Pomegranate.click();
		}
		WebElement Pomegranate = driver.findElement(By.xpath("(//*[text()='ADD TO CART'])[17]"));
		Pomegranate.click();
		return Pomegranate;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")
	private WebElement GreenAdd;

	public WebElement getGreenAdd() {
		GreenAdd.click();
		return GreenAdd;
	}

	@FindBy(how = How.XPATH, using = "//*[text()='PROCEED TO CHECKOUT']")
	private WebElement CheckOut;

	public WebElement CheckOut() {
		CheckOut.click();
		return CheckOut;
	}

	/*
	 * @FindBy(how=How.XPATH, using="//input[@class='promoCode']") private
	 * WebElement PromoCode;
	 * 
	 * public WebElement PromoCode(String enterPromoCode) throws
	 * InterruptedException { Thread.sleep(2000);
	 * PromoCode.sendKeys(enterPromoCode); return PromoCode;
	 * 
	 * }
	 */

	public WebElement getPromoCode() throws InterruptedException {

		Thread.sleep(5000);

		WebElement PromoCode = driver.findElement(By.xpath("//input[@class='promoCode']"));
		PromoCode.sendKeys("rahulshettyacademy");
		return PromoCode;

	}

	@FindBy(how = How.XPATH, using = "//button[@class='promoBtn']")
	private WebElement Apply;

	public WebElement getApply() {
		Apply.click();
		return Apply;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/button")
	private WebElement PlaceOrder;

	public WebElement getPlaceOrder() throws InterruptedException {

		Thread.sleep(5000);
		PlaceOrder.click();
		return PlaceOrder;
	}

	@FindBy(how = How.XPATH, using = "//select[@style='width: 200px;']")
	private WebElement SelectButton;

	public WebElement getSelesctButton(String entercountry) {
		Select select = new Select(SelectButton);
		select.selectByVisibleText(entercountry);
		return SelectButton;
	}

	@FindBy(how = How.XPATH, using = "//input[@class='chkAgree']")
	private WebElement Checkbox;

	public WebElement getCheckbox() {
		Checkbox.click();
		return Checkbox;
	}

	@FindBy(how = How.XPATH, using = "//*[text()='Proceed']")
	private WebElement Procced;

	public WebElement getProcced() {
		Procced.click();
		return Procced;
	}

}
