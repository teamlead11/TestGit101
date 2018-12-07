package mypack;

import java.util.Scanner;

public class BaseClass 
{
	public void reversestringbyavinaash()
	{
		      String original, reverse = "";
		      Scanner in = new Scanner(System.in);
		     
		      System.out.println("Enter a string to reverse");
		      original = in.nextLine();
		     
		      int length = original.length();
		     
		      for (int i = length - 1 ; i >= 0 ; i--)
		         reverse = reverse + original.charAt(i);
		         
		      System.out.println("Reverse of the string: " + reverse);
		   
	}
	public static void main(String[] args) 
	{
		BaseClass av=new BaseClass();
		av.reversestringbyavinaash();
	}
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\eclipse-workspace\\clone\\TestGit101\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("gopigop84@gmail.com");		
	}
	int a=10,b=20,c;
	public void addBharath() 
	{
       c=a+b;
       System.out.println(c);
	}
	public void gopi() 
	{	
	       c=a+b;
	       System.out.println(c);
	}
	{
		//System.out.println("project class");
		//System.out.println(c);
		BaseClass bc=new BaseClass();
	    bc.gopi();			
	}*/

}
