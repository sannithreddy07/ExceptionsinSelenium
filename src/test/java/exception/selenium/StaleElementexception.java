package exception.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementexception {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pavantestingtools.com/");
		WebElement element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/ul/li[18]/a"));
		element.click();
		
		Thread.sleep(1000);
		driver.navigate().back(); // when we naviagte to back/refresh , the DOM structure changes as a fresh page appears  , new ajax call are made to server
		Thread.sleep(1000);			//as result the element gets staled(old,decayed, or not fresh element to locate)
									//use try catch to overcome this issue in catch block loctae the staled element and perform click
		try {
		element.click();
		}catch(StaleElementReferenceException e) {
			element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/ul/li[18]/a"));
			element.click();
		}

		driver.close();
		
		
	}

}
