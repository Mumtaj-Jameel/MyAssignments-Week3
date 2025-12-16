package week3.day2;

public class LearnOverloading {
	
	public void reportSetup(String msg,String status) {
		
		System.out.println("The Given Message is " + msg);
		System.out.println("The Current Status is " + status);
	
	}
 public void reportSetup(String msg,String status,boolean snap) {
	 

		System.out.println("The Given Message is " + msg);
		System.out.println("The Current Status is " + status);
		System.out.println("If snap is Working "+ snap);
	 
 }
 
 public static void main(String[] args) {
	
	 
	 LearnOverloading lo=new LearnOverloading();
	 lo.reportSetup("I am Method1 Arugument", "I am Present in Method1");
	 lo.reportSetup("I am Method2 Arugument", "I am Present in Method 2", true);
}

}
