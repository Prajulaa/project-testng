package com.basics;

import java.io.IOException;

import org.openqa.selenium.By;

import com.modules.orangehrm.OrangeHrmLogin;
import com.utility.BaseClass;

public class UploadingImage extends BaseClass{

	public static void main(String[] args) throws IOException {


		launchEdge();
		get("https://opensource-demo.orangehrmlive.com/");
		OrangeHrmLogin login = new OrangeHrmLogin();
		sendKeys(login.getUserName(), "Admin");
		sendKeys(login.getPassword(), "admin123");
		click(login.getLogin());
		
		driver.findElement(By.xpath("//b[text()='Buzz']")).click();
		driver.findElement(By.id("tabLink2")).click();
		driver.findElement(By.xpath("//input[@value='Upload Images']")).click();
		
		//calling the autoit script
		Runtime.getRuntime().exec("C:\\Users\\Prajula-50628\\AutoIT Scripts\\Image.exe");
		
	}

}
