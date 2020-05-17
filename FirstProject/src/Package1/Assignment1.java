package Package1;

public class Assignment1 {

	public int Add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int Sub(int x, int y)
	{
		int z= x-y;
		return z;
		
	}
	public int Mul(int m, int n)
	{
		int p= m*n;
		return p;
	}
	public int Div(int g, int h)
	{
		int i= g/h;
		return i;
	}
	
	public static void main(String[] args) {
		
		Assignment1 Asg = new Assignment1();
		int d = Asg.Add(10, 2); 
		System.out.println("the value of d =" +d);
		int e = Asg.Sub(d, 2);
		System.out.println("the value of e = " +e);
		int f = Asg.Add(e, 2);
		System.out.println("the value of f =" +f);
		int j = Asg.Mul(f, 2);
		System.out.println("the value of j = " +j);
		int k = Asg.Div(j, 2);
		System.out.println("the value of k =" +k);
		System.out.println("the final result is = " +k);
		
	}
}
