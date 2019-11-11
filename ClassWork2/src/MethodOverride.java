
public class MethodOverride {
// override method
	public static void main (String[] args)
	{
		//methodoveride parent obkj= new method override();
		//parentobj.eat();//this will cal the parent calss version of eat()
		MethodOverride obj1=new Boy();
		obj1.eat();
		//parent obj.eat();
		//MethodOverride obj
		//=new MethodOverride();
		//This will call the child class version of eat()
		//obj.eat();
	}
	public void eat()
	{
		System.out.println("hum,a is eating");
	}
	
}
class Boy extends MethodOverride
{
//overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
