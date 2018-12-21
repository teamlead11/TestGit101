package mypack;

import java.util.Scanner;

public class TestCase3 {

	public static void main(String[] args) {
		System.out.println("Here test case modified by vinoth");

		System.out.println("Test Case Created");
		 String org, rev = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to reverse");
	      org = in.nextLine();
	      int length = org.length();
	     
	      for (int i = length - 1 ; i >= 0 ; i--)
	         rev = rev + org.charAt(i);
	         
	      System.out.println("Reverse of the string: " + rev);
		
	}	
}
