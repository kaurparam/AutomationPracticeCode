package mavenproject.test1;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;


public class AutomationHOMEDEPOT {
	WebDriver driver;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Harpuneet\\\\Desktop\\\\test1\\\\Drivers\\\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}

	public void practice() {
	Actions actiontab = new Actions(driver);
	WebElement Headtab = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
	actiontab.moveToElement(Headtab).perform();
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();	// click summer dresses
	Actions actions = new Actions(driver);
	WebElement menu = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"));
	actions.moveToElement(menu).perform();
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]/span[1]")).click();// click quick view
	try {
		Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.id("group_1")));
	dropdown.selectByIndex(0);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]")).click();//click add to cart
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();// click continue shopping
	Actions action = new Actions(driver);
	WebElement cartselect = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]"));
	action.moveToElement(cartselect).perform();
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]/span[1]")).click();// click check out
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();// click proceed to checkout
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("paramjotkaur1008@gmail.com");// put email address
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();// click create account
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("param");// enter first name
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("k");// enter last name
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("pk1234");// enter password
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("param");// firstname 
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kaur");//lastname
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("45 heatherdale dr");//enter address
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("brampton");// enter city
	try {
		Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.id("id_state")));
	dropdown.selectByIndex(0);
	}catch(Exception s)
	{
		System.out.println(s);
	}
	driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("01234");// enter address
	try {
		Thread.sleep(5000);
	Select dropdown = new Select(driver.findElement(By.id("id_country")));
	dropdown.selectByIndex(0);
	}catch(Exception c)
	{
		System.out.println(c);
	}
	driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("4372454870");// enter phone number
	driver.findElement(By.xpath("//input[@id='alias']")).clear(); // clear default text
	driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("45 heatherdale dr");
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();// click register
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click(); //click proceed checkout
	driver.findElement(By.xpath("//input[@id='cgv']")).click(); //Agree terms and services
	driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click(); //click proceed to checkout
	
	
}

public void Teardown() {
	driver.close();

}
}
