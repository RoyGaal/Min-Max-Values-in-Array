package cmp326;

public class MaxMinInMyArray {
	public static void main(String[] array){
		int[] myArray = {5,9,1,2,13,4,3,-3,30};
		
		int max = myArray[0];
		int min = myArray[0];
		
		for(int i=1; i<myArray.length; i++){
			if(myArray[i] < min){
				min = myArray[i];
			}
			if(myArray[i] > max){
				max = myArray[i];
			}
		}
		System.out.println("min is:" + min);
		System.out.println("max is:" + max);
		
	}
	

}
