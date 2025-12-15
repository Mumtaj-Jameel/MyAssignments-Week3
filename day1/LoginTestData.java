package week3.day1;

public class LoginTestData extends TestData{

	public void enterUserName() {
		
	System.out.println("Enter a Valid UserName to Login");
	}
	
	public void enterPassword() {
		
		System.out.println("Enter a Valid Password to Login");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUserName();
		ltd.enterPassword();
		ltd.navigateToHomePage();
	}
}
