package lab3_3;

public class ArrayMethods3 {

	public static void main(String[]args) {
		String [] list1 = {"a","c","d","b","k","p","e","b"};
		int [] list2 = {1,3,4,2,6,5,9,7,8};
		double [] list3 = {3.14,6.89,13.37,4.20};
		bubbleSort(list1);
		insertionSort(list2);
		selectionSort(list3);
		printStringArray(list1);
		printIntArray(list2);
		printDoubleArray(list3);
		
	}
	public static void insertionSort(int[]list1) {
		for(int i = 0; i < list1.length - 1; i++) {
			int num = list1[i];
			int j = i-1;
			while(j >= 0 && list1[j] > num) {
				list1[j+1] = list1[j];
				j = j-1;
			}
			list1[j+1] = num;
		}
	}
	
	public static void selectionSort(double[]list1) {
		int idx = 0;
		for(int i = 0; i < list1.length-1; i++) {
			for(int j = i+1; j < list1.length; j++) {
				if(list1[j] < list1[i]) {
					idx = j;
				}
			}
			double temp = list1[idx];
			list1[idx] = list1[i];
			list1[i] = temp;
		}
	}
	
	public static void bubbleSort(String[]list1) {
		for(int i = 0; i < list1.length-1; i++) {
			for(int j = i+1; j < list1.length; j++) {
				if(list1[i].compareTo(list1[j]) > 0) {
					String temp = list1[j];
					list1[j] = list1[i];
					list1[i] = temp;
				}
			}
		}
	}
	
	public static void printStringArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	public static void printIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	
	public static void printDoubleArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}
