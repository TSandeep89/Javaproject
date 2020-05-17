package Package1;

public class Assignment3 {
	
public Assignment3()
{
	this(1,2,3,4);
	System.out.println("default constructor");
}

public Assignment3(int a)
{
	this();
	System.out.println("one parameterized constructor");
}
	
public Assignment3(int a, int b)
{
	this(1,2,3);
	System.out.println("two parameterized constructor");
}

public Assignment3(int a, int b, int c)
{
	this(1);
	System.out.println("three parameterized constructor");
}

public Assignment3(int a, int b, int c, int d)
{

	System.out.println("four parameterized constructor");
}

public static void main(String[] args) {
	
	Assignment3 Asgmt = new Assignment3(10,20);
	
}
}
