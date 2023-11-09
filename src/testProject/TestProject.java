package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kefitech\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://coetest.mguonline.ac/#/singlepgm/2/NA");
		driver.findElement(By.xpath("/html/body/app-root/body/header/div[2]/div/div/div[5]/div/div/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("testfee@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[3]/div/input")).click();	

		
	}

}
