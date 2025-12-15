package week3.day1;

import java.util.Arrays;

public class learnArray {

	public static void main(String[] args) {
		int num[]= {95,96,100,40,50,20};
		
		//Length
		
		int lengthnum= num.length;
		System.out.println("The Length of a given array " + lengthnum);
		
		//Last index
		
		int lastin=num[lengthnum-1];
		System.out.println("The Last index value of given array "+ lastin);
		
		//First index
		
		System.out.println("First index value of given array "+ num[0]);
		
		//Sorting Array Ascending
		
 Arrays.sort(num);
	
   for(int i=0;i<num.length;i++) {
	   System.out.println("Array after sorting " + num[i]);
   }
   
	//Sorting Array Ascending
	
Arrays.sort(num);

for(int i=0;i>num.length;i--) {
  System.out.println("Array after sorting " + num[i]);
 
   }
		
	}	

	}


