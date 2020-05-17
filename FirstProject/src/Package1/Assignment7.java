package Package1;

public class Assignment7 extends Assignment6 {
	
	public  Assignment7()
	{
		this(1,2,3);
		System.out.println("default child class");
		}
	public  Assignment7(int a)
	{
		this(1,2,3,4);
		System.out.println("one parameter child class");
		}
	public  Assignment7(int a, int b)
	{
		this(1);
		System.out.println("two parameter child class");
		}
	public  Assignment7(int a, int b, int c)
	{
		 super(1,2,3);
		System.out.println("three parameter child class");
		}
	public  Assignment7(int a, int b, int c, int d)
	{
		this();
		System.out.println("four parameter parent class");
		}
	public static void main(String[] args) {
		Assignment7 a = new Assignment7(10, 20);
		//a.Assignment6();
	}

}
