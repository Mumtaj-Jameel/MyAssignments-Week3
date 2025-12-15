package week3.day1;

public class TestData {
	
	public void enterCredentials() {
		
	System.out.println("Enter the Vaild Login Details");
	}
	
	public void navigateToHomePage() {
		 System.out.println("This will redirect to Home page");
		
	}
	
	public static void main(String[] args) {
		
		TestData td=new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}

}
