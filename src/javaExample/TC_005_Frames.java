package javaExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

import org.openqa.selenium.By;

public class TC_005_Frames {
public static void main(String args[]) throws Exception{
    //Test Steps
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(5000);
//Enter into frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
Thread.sleep(4000);
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
//exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
//close application or browser
driver.close();
System.out.println("Closed Application");
}
}