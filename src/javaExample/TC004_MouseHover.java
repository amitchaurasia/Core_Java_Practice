package javaExample;

//To access webdriver class & method
import org.openqa.selenium.WebDriver;
//To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.Action;
//To access object identification/element locator method
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC004_MouseHover{
	
	//Test Data
		//DT	Var		Variable value to represent data 
		static String url="http://183.82.103.245/nareshit/login.php";
		static String username="nareshit";
		static String password="nareshit";
		static String title1="OrangeHRM - New Level of HR Management";
		static String title2="OrangeHRM";
	
		public static void main(String[] args) throws Exception {
		//Test Steps
		WebDriver driver=new FirefoxDriver();
		//launch url
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		//Verify Page Title
		//Actual Result   compare	Expected Result
		if(driver.getTitle().equals("HRMS")) {
		System.out.println("Title is matched");	
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
			Thread.sleep(3000);
			if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		}
			else
		{
			System.out.println("Title Not Matched");
			System.out.println(driver.getTitle());
		}
			
			//Mouseover
			
			Actions ac=new Actions(driver);
			
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			System.out.println("Mouse Over Completed");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Add Employee")).click();
			System.out.println("Logout completed");
			Thread.sleep(3000);
			driver.close();
			}
		
	}
	
