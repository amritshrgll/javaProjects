package day1;

public class DemoGuru99Project {
	public static void main(String[] args) {
		gurudemo guru=new gurudemo();
		guru.invokeBrowser();
		guru.login("mngr219504","sesEzUt");
		guru.addcustomer();
		guru.AddDetails();
		
		String customerId=guru.getCustomerId();
		System.out.println("customer id"+customerId);
		guru.addAccount(customerId);
		
		
	}

}
