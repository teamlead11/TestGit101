package mypack;

import java.util.Scanner;

public class BaseClass {

	public void reverseStringBySuriya() {
		String s = "suriya";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("REVERSE STRING : " + sb.reverse().toString());
	}
	public void reverseStringGokul()
	{
		String s="Gokul";
		StringBuilder rever=new StringBuilder(s);
		StringBuilder reverse = rever.reverse();
		System.out.println("Here you find an Reverse String:" +reverse);
	}

	public void reversestringbyavinaash() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to reverse");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		System.out.println("Reverse of the string: " + reverse);

	}

	public static void main(String[] args) {
		BaseClass av = new BaseClass();
		av.reversestringbyavinaash();
		av.reverseStringBySuriya();
		av.test1();
		av.wasim();
		av.Reverse();
		av.reverseStringGokul();
	}

	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Gopi\\eclipse-workspace\\clone\\TestGit101\\driver\\chromedriver.exe"
	 * ); WebDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("https://www.facebook.com/"); WebElement mail =
	 * driver.findElement(By.xpath("//input[@name='email']"));
	 * mail.sendKeys("gopigop84@gmail.com"); } int a=10,b=20,c; public void
	 * addBharath() { c=a+b; System.out.println(c); } public void gopi() {
	 * c=a+b; System.out.println(c); } { //System.out.println("project class");
	 * //System.out.println(c); BaseClass bc=new BaseClass(); bc.gopi(); }
	 */
	public void test1() {
		System.out.println("subash");
	}

	public void wasim() {
		String name = "WELCOME";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		}
		public void Reverse() {
			System.out.println("Test Case Created");
			 String original, reverse = "";
		      Scanner in = new Scanner(System.in);
		     
		      System.out.println("Enter a string to reverse");
		      original = in.nextLine();
		      int length = original.length();
		     
		      for (int i = length - 1 ; i >= 0 ; i--)
		         reverse = reverse + original.charAt(i);
		         
		      System.out.println("Reverse of the string: " + reverse);
			}
	}

