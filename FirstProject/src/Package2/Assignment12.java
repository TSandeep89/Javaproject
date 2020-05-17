package Package2;

public class Assignment12 extends Assignment11 {

	public static void  test2()
	{
		System.out.println("static method call in same class");
	}
	public static void main(String[] args) {
		
		Assignment12 agnt = new Assignment12();
				agnt.test1();
	}
}
