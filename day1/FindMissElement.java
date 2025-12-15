package week3.day1;

import java.util.Arrays;

public class FindMissElement {
	
	public void  MissElement() {
		
		int arr[]= {1,4,3,2,8,6,7};
		
		int l1=arr.length;
		
		Arrays.sort(arr);
		
		for(int i=0;i<l1;i++) {
			
			if(arr[i] != i+1) {
				
				System.out.println("Missing Element "+ (i +1));
				break;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		FindMissElement fe=new FindMissElement();
		fe.MissElement();
	}

}
