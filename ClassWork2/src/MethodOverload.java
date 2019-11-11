
public class MethodOverload {
	//overload sum().This sum takesthree int parameters
	public int sum(int x, int y, int z)
	{
	return(x+y+z);
	}
	//overload sum().This sum takes two double parameters
	public double sum(double x,double y)
	{
		return (x+y);
	}
	// Driver code
	public static void main(String args[]) {
		MethodOverload s= new MethodOverload();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20,30));
		System.out.println(s.sum(10, 20));
	}
	

}
