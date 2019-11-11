import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args)
	{
	int n,reverse=0;
	System.out.println("enter the number");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	while(n!=0)
	{
		reverse=reverse*10;
		reverse=reverse+n%10;
		n=n/10;
		
	}
	System.out.println("reverse is"+reverse);
	}

}
