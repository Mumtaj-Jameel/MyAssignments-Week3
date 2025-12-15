package week3.day1;

public class Edge extends Chrome {

	
	public void takeSnap() {
		
		System.out.println("This will Captureyour Screen");
	}
	
	public void clearCookies() {
		
		System.out.println("Clear Your Memory");
	}
	
	public static void main(String[] args) {
		
		Chrome ch= new Chrome();
		ch.openIncognito();
		ch.clearCache();
		
	}
}
