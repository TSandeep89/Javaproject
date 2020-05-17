package Package2;

public class Assignment11  {
	
	public static void  test1()
	{
		System.out.println("static method call in 1st class");
	}
	
public static void main(String[] args) {
		
		Assignment11 agnt = new Assignment11();
				agnt.test1();
		        Assignment11.test1();
		        test1();
		
	}
	
}
