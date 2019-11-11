
public class AbstractExample {
	//abstract parent class
	abstract class Animal{
		//abstract method
		public abstract void sound();
		/*if atyleast one method is abstract,class should be  declared as abstract class*/
		public void color()
		{
			System.out.println("color is grey");
		}
	}
	//AbstractionExample class extends Animal class
	public class AbstractionExample extends Animal{
		public void sound ()
		{
			System.out.println("woof");
			public void color() {
				System.out.println("color is green");
			}
			public static void main(String[] args) {
			
			
		}
	}

}
