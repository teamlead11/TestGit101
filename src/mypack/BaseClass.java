package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\eclipse-workspace\\clone\\TestGit101\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("gopigop84@gmail.com");
		
	}



		int a=10,b=20,c;
	
	public void addBharath() {
		
       c=a+b;
       System.out.println(c);
	}
	
	public void gopi() {
		
	       c=a+b;
	       System.out.println(c);
		}

	{
		
		
		//System.out.println("project class");
		//System.out.println(c);
		BaseClass bc=new BaseClass();
	      bc.gopi();	
	
		
		
	}

}

