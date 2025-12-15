package week3.day1;

public class Safari extends Edge {
	
	public void readerMode() {
		
		System.out.println("Screen is in reader mode");
	}
	
	public void fullScreenMode() {
		
		System.out.println("Screen is in Full Screen");
	}

	
	public static void main(String[] args) {
		
		Safari sf=new Safari();
		sf.openUrl();
		sf.closeBrowser();
		sf.navigateBack();
		sf.openIncognito();
		sf.clearCache();
		sf.takeSnap();
		sf.clearCookies();
		sf.readerMode();
		sf.fullScreenMode();
		
		
	}
}
