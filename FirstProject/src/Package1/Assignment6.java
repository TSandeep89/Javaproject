package Package1;

public class Assignment6 {

	public  Assignment6()
	{
		this(1,2,3,4);
		System.out.println("default parent class");
		
	}
	
	public  Assignment6(int a)
	{
		this(1,2);
		System.out.println("one parameter parent class");
		
	}
	public  Assignment6(int a, int b)
	{
		this();
		System.out.println("two parameter parent class");
		}
	public  Assignment6(int a, int b, int c)
	{
		this(1);
		System.out.println("three parameter parent class");
		}
	public  Assignment6(int a, int b, int c, int d)
	{
		
		System.out.println("four parameter parent class");
		}	
	
	}
