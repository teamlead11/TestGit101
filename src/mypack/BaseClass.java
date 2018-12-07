package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public void wasim() {		
		String name = "WELCOME";
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			rev = rev + ch;					
		}
		System.out.println(rev);

	}

	public static void main(String[] args) {		
		BaseClass bc = new BaseClass();
		bc.wasim();
	}
}

