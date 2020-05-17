package Package1;

import java.util.Scanner;

public class Assignment5 {

	
	public int Add(int a, int b)
	{
		int c = a+b;
		return c;
		
	}
	
	public int Sub(int d, int e)
	{
		int f = d-e;
		return f;
		
	}
	
	public int Mul(int g, int h)
	{
		int i = g*h;
		return i;
		
	}
	
	public void Div(int j, int k)
	{
		int l = j/k;
		System.out.println("the output of the expression is (((((x1+x2)-x3)+x4)*x5)/x6) is " +l);
	}
	
	public static void main(String[] args) {
		
		System.out.println("the value of x1");
		Scanner s =new Scanner(System.in);
		int x1= s.nextInt();
		
		System.out.println("the value of x2");
		int x2=s.nextInt();
		System.out.println();
		
		System.out.println("the value of x3");
		int x3=s.nextInt();
		System.out.println();
		
		System.out.println("the value of x4");
		int x4=s.nextInt();
		System.out.println();
		
		System.out.println("the value of x5");
		int x5=s.nextInt();
		System.out.println();
		
		System.out.println("the value of x6");
		int x6=s.nextInt();
		System.out.println();
		
		Assignment5 as = new Assignment5();
		int z= as.Add(x1, x2);
		int y= as.Sub(z, x3);
		int x= as.Add(y, x4);
	    int v=as.Mul(x, x5);
	    as.Div(v, x6);
        
		}
}
