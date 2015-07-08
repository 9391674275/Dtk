package com.koya.MRA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DTK4 {

	
	public static void main(String[] args) throws Exception {
		System.out.println("createnewMRA");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.0.187:8087/newclient.aspx");
		
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sivaclient");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterParty']"))).selectByIndex(12);
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByIndex(2);
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByIndex(2);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedCP']"))).selectByIndex(1);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedCE']"))).selectByIndex(1);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddStrength']"))).selectByIndex(1);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddPartyA']"))).selectByIndex(1);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddPartyB']"))).selectByIndex(2);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementslist']"))).selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_lblStatus']/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnEdit']")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterParty']"))).selectByIndex(15);
		Thread.sleep(3000);
		
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(5);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByIndex(5);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByIndex(5);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedCP']"))).selectByIndex(2);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedCE']"))).selectByIndex(2);
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddPartyA']"))).selectByIndex(2);
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddPartyB']"))).selectByIndex(1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		//driver.close();
		
		

	}

}
