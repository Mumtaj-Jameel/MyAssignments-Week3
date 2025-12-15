package week3.day1;

public class Browser {
	
	public static String browserName;
	public static String browserVersion;
	
	public void openUrl() {
		
		System.out.println("Opening Url of the Browser");
	}
	
	public void closeBrowser() {
		
		System.out.println("Closing Browser");
	
	}
	 public void navigateBack() {
		 
		 System.out.println("This will navigate to Page");
	 }
	 public static void main(String[] args) {
		
		 Browser bwr = new Browser();
		 bwr.openUrl();
		 bwr.closeBrowser();
		 bwr.navigateBack();
	}
	

}
