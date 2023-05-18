package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ProjectK {

	public static void main(String[] args) {
		
	
		WebDriver driver;
		
		driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");

WebElement email = driver.findElement(By.id("email"));
email.click();

WebElement email1 = driver.findElement(By.id("pass"));
email1.click();
	}
}
