package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MissNumber {
	
	public static void main(String[] args) {
		
	
	
Integer[] ar= {1,2,3,4,10,6,8};

List<Integer> list = new ArrayList<>(Arrays.asList(ar));

Collections.sort(list);

for(int i=0;i<list.size()-1;i++) {
	
	int curele=list.get(i);
	
	int nexele=list.get(i+1);
	
	if(curele + 1 != nexele) {
		
		for (int miss=curele + 1; miss<nexele ;miss ++) {
			
			System.out.println("Missing Elements are " + miss);
		}
	}
	
	
	
}

}
}
