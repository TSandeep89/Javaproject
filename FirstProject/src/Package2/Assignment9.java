package Package2;

public class Assignment9 extends Assignment8 {
	
	public void chlid()
	{
		System.out.println("default child method");
	}
	
	public void chlid1(int a)
	{
		System.out.println("1 child method");
	}	
	
	public void chlid2(int a, int b)
	{
		
		System.out.println("2 child method");
	}
	public void chlid3(int a, int b, int c)
	{
		super.parent4(1, 2, 3, 4);
		super.parent();
		super.parent2(1, 2);
		super.parent1(1);
		super.parent3(1, 2, 3);
		System.out.println("3 child method");
	}
	
	public void chlid4(int a, int b, int c, int d)
	{
		System.out.println("4 child method");
	}
	public static void main(String[] args) {
		Assignment9 as = new Assignment9();
		as.chlid3(1, 2, 3);
		as.chlid();
		as.chlid4(1, 2, 3, 4);
		as.chlid1(1);
		as.chlid2(1, 2);
	}
}
