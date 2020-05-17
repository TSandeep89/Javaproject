package Package1;

public class Student {
	
	int roll_no= 10, age = 20;
	
	public void Display1()
	{
		System.out.println("Welcome to all of you ");
		
	}

	public void Display2()
	{
		System.out.println("Automation is very easy");
		
	}
	public static void main(String[] args) {
		
		Student Deepak = new Student();
		Deepak.roll_no= 10;
		System.out.println("the roll no is "+ Deepak.roll_no);
		Deepak.age= 20;
		System.out.println("the age is " + Deepak.age);
		Deepak.Display1();
		Deepak.Display2();
		
	}
}
