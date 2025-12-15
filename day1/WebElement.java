package week3.day1;

public class WebElement {
	
	public void  click() {
		System.out.println("Here we can perform click operation");
	}
	
	public void setText(String Text) {
		System.out.println("Text Set as " + Text);
	}
	
	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();
		we.setText("Hello World");
	}
}
