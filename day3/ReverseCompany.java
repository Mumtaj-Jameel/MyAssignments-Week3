package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCompany {

	public static void main(String[] args) {
		
		String[] comp= {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> compli=new ArrayList<>();
		
		for(int i=0;i<comp.length;i++) {
			
			compli.add(comp[i]);
			
		}
		
		Collections.sort(compli);
		
		for(int i=compli.size()-1;i>=0;i--) {
			
			System.out.println(compli.get(i));
				
		}
		

	}

}
