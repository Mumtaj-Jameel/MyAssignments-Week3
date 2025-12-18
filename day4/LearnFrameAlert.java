package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert al=driver.switchTo().alert();
		String at=al.getText();
		System.out.println(at);
		
		al.accept();
		String msg=driver.findElement(By.id("demo")).getText();
		System.out.println("The Message is "+ msg);
		
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		al.dismiss();
		String msg1=driver.findElement(By.id("demo")).getText();
		System.out.println("The Message is "+ msg1);
		
		
		
		
	}

}
