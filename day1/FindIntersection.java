package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
		int a1[]= {4,5,6,7,8,9};
		int a2[]= {1,2,3,4,5,6};
		
		//Length
		
		int len1=a1.length;
		int len2=a2.length;
		
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if (a1[i]==a2[j]) {
					System.out.println("The Matching Elements are " + a1[i]);
				}
			}
		}

	}

}
