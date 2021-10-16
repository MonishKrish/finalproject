package com.project.OctProject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium_Sept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.className("login"));
		clickonElement(login);
		
		
		
		driver.findElement(By.id("email_create")).sendKeys("Monish42@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

		driver.findElement(By.id("customer_firstname")).sendKeys("Monish");
		driver.findElement(By.id("customer_lastname")).sendKeys("R");
		driver.findElement(By.id("passwd")).sendKeys("Rmonish05$");
		Thread.sleep(3000);

		WebElement se = driver.findElement(By.id("days"));

		Select re = new Select(se);
		re.selectByIndex(10);

		Thread.sleep(5000);

		WebElement se1 = driver.findElement(By.id("months"));
		Select re1 = new Select(se1);

		re1.selectByIndex(1);

		Thread.sleep(5000);

		WebElement se2 = driver.findElement(By.id("years"));

		Select re2 = new Select(se2);

		re2.selectByIndex(10);


		driver.findElement(By.id("address1")).sendKeys("100 N. Howard St. Suite W Spokane");
		driver.findElement(By.id("city")).sendKeys("Seattle");

		Thread.sleep(3000);

		WebElement se3 = driver.findElement(By.id("id_state"));

		Select re3 = new Select(se3);
		re3.selectByValue("47");


		driver.findElement(By.id("postcode")).sendKeys("98101");

		driver.findElement(By.id("other")).sendKeys("18143008351");



		driver.findElement(By.id("phone_mobile")).sendKeys("+18143008351");


		driver.findElement(By.id("alias")).clear();


		driver.findElement(By.id("alias")).sendKeys("+401 BROADWAY E , SEATTLE, WA");



		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		

driver.findElement(By.id("email")).sendKeys("Monish42@gmail.com");

driver.findElement(By.id("passwd")).sendKeys("Rmonish05$");

Thread.sleep(3000);

driver.findElement(By.id("SubmitLogin")).click();



TakesScreenshot ts = (TakesScreenshot) driver;





}

	private static void clickonElement(WebElement login) {
		// TODO Auto-generated method stub
		
	}

