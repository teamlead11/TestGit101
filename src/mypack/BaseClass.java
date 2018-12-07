 package mypack;

public class BaseClass {
	
	int a=10,b=20,c;
	
	public void addBharath() {
		
       c=a+b;
       System.out.println(c);
	}
	
	public void gopi() {
		
	       c=a+b;
	       System.out.println(c);
		}

	public static void main(String[] args) {
		
		
		//System.out.println("project class");
		//System.out.println(c);
		BaseClass bc=new BaseClass();
	      bc.gopi();	
	
		
		
	}

}
