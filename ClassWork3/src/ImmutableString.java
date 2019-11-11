
public class ImmutableString {
	public static void main(String args[]) {
		String s="Sachin";
		s=s.concat(" Tendulkar");
		//concat() mehod appends the string at the end
		System.out.println(s);
		//will print Sachin because strings are immutable objects
		s = s.concat(" Ganguly");
		//result of concat() is appended to the string
		System.out.println(s);
	}

}
