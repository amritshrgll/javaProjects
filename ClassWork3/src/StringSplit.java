
public class StringSplit {
public static void main(String[] args)
{
	String strmain="Alpa Beta Delta Gamma Sigma";
	String[] arrSplit =strmain.split(" ");
	for(int i=arrSplit.length -5;i<5;i++)
	{
		System.out.println(arrSplit[i]);
	}
	
	}
}
