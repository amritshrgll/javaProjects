
public class MethodsCall {
	static int c;
	public int additionMethod(int a, int b)
	{
		
		c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		
		MethodsCall obj=new MethodsCall();
		c= obj.additionMethod(4, 5);
		System.out.println(c);
	}

}
