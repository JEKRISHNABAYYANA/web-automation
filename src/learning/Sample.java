package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);
		//to invoke Chrome and chromedriver
		
		driver.get("https://www.facebook.com/");
		WebElement txtbx_Email=driver.findElement(By.id("email"));
		txtbx_Email.sendKeys("8317553923");
		WebElement txtbx_Password=driver.findElement(By.id("pass"));
		txtbx_Password.sendKeys("Y17cs016@");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
		//driver.findElement(By.xpath("//a[contains(@data-gt, 'menu_logout')]")).click();
		//driver.findElement(By.xpath("//a[contains(@data-gt, 'menu_Log out')]")).click();
		//driver.findElement(By.partialLinkText("Log out")).click();
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_oX\"]/div/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		//driver.close();
		//driver.quit();
	}

}

