package Package1;

public class Assignment2 {
	
	public int Add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int Sub(int d, int e)
	{
		int f= d-e;
		return f;
		
	}
	public int Mul(int g, int h)
	{
		int i= g*h;
		return i;
	}
	public int Div(int k, int l)
	{
		int i= k/l;
		return i;
	}
	public static void main(String[] args) {
	
		Assignment2 Asg = new Assignment2();
		int o = Asg.Div(10, 2);
		System.out.println("the value of o = " +o);
		int p = Asg.Sub(o, 2);
		System.out.println("the value of p =" +p);
		int q = Asg.Add(p, 2);
		System.out.println("the value of q = " +q );
		int r = Asg.Add(q, 2);
		System.out.println("the value of r =" +r);
		int s = Asg.Mul(r, 2);
		System.out.println("the value of s = " +s);
		System.out.println("the final result is " +s);
}

}
