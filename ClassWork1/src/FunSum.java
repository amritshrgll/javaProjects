import java.util.Scanner;

public class FunSum {
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number =");
		int a=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the second number =");
		int b=s2.nextInt();
		FunSum A1=new FunSum();
		int x=A1.sum(a, b);
	
		System.out.println("result = "+x);
		
	}

}
