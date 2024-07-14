package final_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test(priority=1)
public class user_login extends setup {
	
	public static void login() {
		//Navigate to login button
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Susmita");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();	
	}
	//@Test(priority=1)
	//public static void signup() {
		
	//Click on sign up button
	//{
		//driver.findElement(By.xpath("//a[@id='signin2']")).click();

	//Fill the details
	//driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("Susmita");
	//driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("12345");

	//driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	//}
		
	//}
	@Test(priority=2)
	public void cart() {
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		
	}
	@Test (priority = 3)
	public void checkout(){
		cart();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Susmita");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Nepal");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kathmandu");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("54321");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("July");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//body/div[@id='orderModal']/div[1]/div[1]/div[3]/button[1]")).click();
	}
	
@Test(priority=4)
public void item() {
		//click on item
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		//additemtocart
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		
}

@Test(priority=5)
	public void deleteproduct(){
		cart();
		driver.findElement(By.linkText("Delete")).click();
	}

//Fill the details
@Test(priority=6)
public void contact(){
	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("susmita@gmail.com");
	driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Susmita");
	driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("");
	driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
}

@Test(priority=7)
public void slideimage() {
	driver.findElement(By.xpath("//body/nav[@id='narvbarx']/div[@id='contcar']/div[@id='carouselExampleIndicators']/a[1]/span[1]"));
	driver.findElement(By.xpath("//body/nav[@id='narvbarx']/div[@id='contcar']/div[@id='carouselExampleIndicators']/a[1]/span[1]"));
}
@Test (priority =8)
public void logout1(){
	driver.findElement(By.xpath("//a[@id='logout2']")).click();
					
}
@Test(priority=9)	
public void aboutpage(){
	driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();
	driver.findElement(By.cssSelector(".vjs-big-play-button")).click();
					
 }  
   }
	 		 
	 	 
	





	



