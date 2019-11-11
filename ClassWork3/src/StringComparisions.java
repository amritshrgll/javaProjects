
public class StringComparisions {
	public static void main(String[] args) {
		//todo auto generated method stub
		String s1= "javapoint";
		String s2="javapoint";
		String s3="JAVAPOINT";
		String s4="python";
		System.out.println(s1.equals(s2));
		//true because content and case is same
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));
	}

}
