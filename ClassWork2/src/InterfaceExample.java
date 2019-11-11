
public class InterfaceExample {
interface Pet{//interface keyword should be used
	public void test();
	public void greeting();
	
}
static class Dog implements Pet{
	public void test() {
		System.out.println("Interface method implemented");
	}
	public void greeting() {
		System.out.println("hi");
	}
	public static void main(String args[]) {
		Pet p=new Dog();
		p.test();
		p.greeting();
		
	}
}
}
