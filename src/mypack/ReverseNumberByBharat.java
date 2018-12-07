package mypack;

import java.util.Scanner;

public class ReverseNumberByBharat {

	public static void main(String[] args) {
		
			Scanner rs=new Scanner(System.in);
			System.out.println("Enter the number");
			int original=rs.nextInt();
			int reverse=0;
			int remainder;
			while(original!=0) {
				remainder=original%10;
				reverse=reverse*10+remainder;
				original=original/10;
			}System.out.println("reverse number:\t" + reverse);
		}

		}
