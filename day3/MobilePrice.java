package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePrice {
	
	public static void main(String[] args) {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		
		driver.findElement(By.className("lNPl8b")).sendKeys("Samsung",Keys.ENTER);
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
		
		int size=elements.size();
		System.out.println(size);
		
		List<Integer> price=new ArrayList<Integer>();
		
		for(int i=0;i<elements.size();i++) {
			String text=elements.get(i).getText();
			
			System.out.println(text);
			
			//if(!text.isEmpty()) {
				
				//String priceText=text.replace(",", "").replace("₹", "");
				
				
				//int finalValues= Integer.parseInt(priceText);
				
			//	price.add(finalValues);
			}
			
			
		}
		//Collections.sort(price);
	//	System.out.println(price);
	}


