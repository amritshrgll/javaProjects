
public class ThisExample {
	int a=10;
	int b=12;
	public void setdata1(int a,int b)
	
	{
		this.a=a;
		this.b=b;
		System.out.println("vakue of a="+a);
		System.out.println("value of b="+b);
	}
	public static void main(String args[])
	{
		ThisExample obj=new ThisExample();
		obj.setdata1(10, 15);
	}

}
