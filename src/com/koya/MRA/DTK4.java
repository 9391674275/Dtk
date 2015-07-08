package com.koya.MRA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		
		//driver.close();
		
		

	}

}
