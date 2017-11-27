package lab3_3;

public class ArrayMethods3 {

	public static void main(String[]args) {
		String [] list1 = {"a","c","d","b","k","p","e","b"};
		bubbleSort(list1);
		printArray(list1);
		
	}
	public static void insertionSort(int[]list1) {
		int lowest = list1[0];
		int lowestIdx = 0;
		for(int i = 0; i < list1.length - 1; i++) {
			for(int j = i+1; j < list1.length; j++) {
				
			}
			
		}
	}
	
	public static void selectionSort(double[]list1) {
		
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
	
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}
