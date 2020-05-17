package Package2;

public class Assignment10 {
	
	public  void  test()
	{
		System.out.println("non-static method in same class");
	}
	
	public static void main(String[] args) {
		
		Assignment10 t = new Assignment10();
		t.test();
	}

}
