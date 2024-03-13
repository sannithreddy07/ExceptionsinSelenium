package exception.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllExceptions {


	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");
		try {
			//Thread.sleep(3000);
			//No Such Element Exception -- when the element attribute value is incorrect you get this exception
			//Resolution: provide correct attribute value  or use any other AT & AV
			driver.findElement(By.xpath("//a[@class='_1jKL3b']"));
			driver.findElement(By.name("txtPassword"));

			//NoSuchWindowException: -- when you try to switch to a window but that window is not available to open 
			//driver.switchTo().window("abcd");

			//NoSuchFrameException -- when you specify incorrect frame id/name/index
			//driver.switchTo().frame("frame1"); //id/name/index

			//NoAlertPresentException -- when there is no pop-up/alert appear on webpage but still try to switch to an alert
			//driver.switchTo().alert();

			//InvalidSelectorException -- when input wrong format of xpath,css,...see ex : i have given 3 /// but xpath start with // or /
			//driver .findElement(By.xpath("///a[@class='_1jKL3b']"));

			//ElementNotInterractable or ElementNotVisible- Element is present in DOM but when element is having attribute as hidden in DOM that cannot be located

			//NoSuchSessionException - quit from browser but still you are trying to find an element	


		}catch (Exception e) {
			System.out.println(e);}		//you are getting exception but still you want to continue the execution use catch/finaaly block
		finally {
			driver.quit();
			System.out.println("browser closed");
		}
		
		//driver.findElement(By.xpath("//a[@class='_1jKL3b']"));

		//TimeoutException -- ex if the element/code is not executed in given time then it will timeout exception



	}	


}


