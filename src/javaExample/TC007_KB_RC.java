package javaExample;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class TC007_KB_RC {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	//Click : Keyboard action 1.TAB 2.ENTER
	Robot  r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	System.out.println("TAB");
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("ENTER");
	Thread.sleep(4000);
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	}
	}