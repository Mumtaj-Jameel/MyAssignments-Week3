package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofArray {

	public static void main(String[] args) {
		  int[] arr1 = {3, 2, 11, 4, 6, 7};
	        int[] arr2 = {1, 2, 8, 4, 9, 7};

	      
	        List<Integer> list1 = new ArrayList<>();
	        List<Integer> list2 = new ArrayList<>();

	        for (int i = 0; i < arr1.length; i++) {
	            list1.add(arr1[i]);
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            list2.add(arr2[i]);
	        }

	        
	        System.out.println("Common values:");

	        for (int i = 0; i < list1.size(); i++) {
	            if (list2.contains(list1.get(i))) {
	                System.out.println(list1.get(i));
	            }
	        }

	}

}
