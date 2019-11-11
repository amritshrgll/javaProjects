 class Company 
{
private int empid;
public void SetEmp(int empid1)
	{
	empid=empid1;
	}
public int GetData()
	{
	return empid;
	}
}
public class Encap
{
	public static void main(String[] args)
	{
		Company obj =new Company();
		obj.SetEmp(10);
		System.out.println(obj.GetData());
	}
}
