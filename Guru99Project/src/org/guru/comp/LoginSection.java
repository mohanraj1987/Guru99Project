package org.guru.comp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//****************** Day 1 *******************
public class LoginSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\GreensTech\\Guru99Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(Utils.loginUrl);
		
		driver.manage().window().maximize();
		
		String expectedResult = "Guru99 Bank Home Page";
		String actualResult = " ";
		
		actualResult = driver.getTitle();
		System.out.println(actualResult);
		
		if(actualResult.contentEquals(expectedResult))  {
			System.out.println("Title contant Test Passed");
		} else {
			System.out.println("Title contant Test Failed");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("mngr246892");
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("mUpezAh");
		driver.findElement(By.xpath("//input[@name= 'btnLogin']")).click();
		
		//****************** Day 2 *******************
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//td[text() = 'Manger Id : mngr246892']"));
		System.out.println(text.getText());
		if(text.getText().contentEquals("Manger Id : mngr246892")) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Failed");
		}
		
		//driver.close();
	}

}
