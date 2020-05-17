package Package1;

public class Assignment4 {

	public Assignment4()
	{
		this(1,2,3);
		System.out.println("default constructor");
	}

	public Assignment4(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
		
	public Assignment4(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("two parameterized constructor");
	}

	public Assignment4(int a, int b, int c)
	{
		
		System.out.println("three parameterized constructor");
	}

	public Assignment4(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		
		Assignment4 Asgmt = new Assignment4(10,20);
		
	}
	
	
}
