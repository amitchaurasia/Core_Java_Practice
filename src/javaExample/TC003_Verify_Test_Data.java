package javaExample;
//To access webdriver class & method
import org.openqa.selenium.WebDriver;
// To access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
//To access object indentification/locator method
import org.openqa.selenium.By;

public class TC003_Verify_Test_Data {
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
				if(driver.getTitle().equals(title1)) {
				System.out.println("Title is matched");	
				}
				else {
				System.out.println("Title not matched");
				System.out.println(driver.getTitle());
				}
				//Test Data of un,pw- HardCoded
				
				//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
				//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
				
				  //Test Data : Variable
				driver.findElement(By.name("txtUserName")).sendKeys(username);
				driver.findElement(By.name("txtPassword")).sendKeys(password);
				
				driver.findElement(By.name("Submit")).click();
				System.out.println("Login Completed");
					Thread.sleep(3000);
					if(driver.getTitle().equals(title2)) {
					System.out.println("Title Matched");
				}
					else
				{
					System.out.println("Title Not Matched");
					System.out.println(driver.getTitle());
				}
					driver.findElement(By.linkText("Logout")).click();
					System.out.println("Logout completed");
					Thread.sleep(3000);
				
					driver.close();
			}

		}

