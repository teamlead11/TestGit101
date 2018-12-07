package mypack;

public class BaseClass {
	 public void test1() {
		 System.out.println("subash");
	 }
	public static void main(String[] args) {
		int a=10,b=20,c;
		System.out.println(c=a+b);
		BaseClass base=new BaseClass();
		base.test1();
	}

}
