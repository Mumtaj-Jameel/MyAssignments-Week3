package week3.day1;

public class ClassAcitivity1 {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		
		int len=num.length;
		System.out.println("Length of given Array " + len);
		
		//Duplicates
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				
				if(num[i] == num[j]) {
					
					System.out.println("The Duplicate Values are" + num[i]);
				}
				
			}
		}

	}

}
