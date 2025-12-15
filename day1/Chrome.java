package week3.day1;

public class Chrome  extends Browser{

	
	public void openIncognito() {
		
	System.out.println("Your Search is Safe");
	}
	
	public void clearCache() {
		
		System.out.println("This will clear your CacheMemory");
	}
	
	public static void main(String[] args) {
		
		Browser chr=new Browser();
		chr.openUrl();
		chr.closeBrowser();
		chr.navigateBack();
		
	}
}
