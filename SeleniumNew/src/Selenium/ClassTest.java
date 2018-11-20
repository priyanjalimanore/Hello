package Selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {

public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "D:\\Priyanjali\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://gmail.com");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("identifierId")).sendKeys("Priyanjalimanore@gmail.com");
				
		
				
				driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
				
				driver.findElement(By.name("password")).sendKeys("Abcd@1234");
				
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				driver.quit();
				
				driver.get("https://gw3.sg.pruconnect.net/my.policy");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("click here.")).click();
				
				driver.findElement(By.name("username")).sendKeys("admsglifebpdev05");
				
				driver.findElement(By.name("password")).sendKeys("admsglifebpdev05");
				
				driver.findElement(By.xpath("//inout[@type='submit']")).click();
				
				
				
				
				
				
				
				
				
					
			}

		}
