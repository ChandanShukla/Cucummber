package com.selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ViSkills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Driver99999\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.vskills.in/certification/");
		driver.findElement(By.xpath("//ul/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nayan");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Shukla");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("snfkjdsfn@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("5125314578");
		driver.findElement(By.xpath("//*[@id=\"input-customer_group_id\"]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"input-customer_group_id\"]"));
		Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]"))); 
		drop.selectByValue("Monster India");
		
		
		
	}

}
