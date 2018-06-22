package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
	int[] a = new int[testArray.length+1];
	for (int k = 0; k < i; k++) {
		a[k]=testArray[k];
	}
	a[i]=j;
	for (int k = i+1; k < testArray.length+1; k++) {
		a[k]=testArray[k-1];
	}
		return a;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		String[] a = new String[orderedArray.length+1];
		for (int k = 0; k < orderedArray.length; k++) {
			a[k]=orderedArray[k];
		}
		a[a.length-1]=string;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
			if(a[j].compareTo(a[j+1])>0) {
				String temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
			}
		}
		
		return a;
	}
	
}
