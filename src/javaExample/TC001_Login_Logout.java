package javaExample;

//To access webdriver class & method
import org.openqa.selenium.WebDriver;
//To access firebox browser
import org.openqa.selenium.firefox.FirefoxDriver;
//To access object indentify/element locator method
import org.openqa.selenium.By;

public class TC001_Login_Logout {
	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000); //wait statement
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000); //wait statement
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000); //wait statement
		System.out.println("Login Completed");
		//driver.findElement(By.linkText("logout")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout Completed");
		driver.close();
		
	}

}
