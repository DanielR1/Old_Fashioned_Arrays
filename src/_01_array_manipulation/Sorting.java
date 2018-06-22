package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray.length-1; j++) {
			if(testArray[j].compareTo(testArray[j+1])>0) {
				String temp=testArray[j];
				testArray[j]=testArray[j+1];
				testArray[j+1]=temp;
				
			}
			}
		}
	}

}
