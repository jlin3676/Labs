package lab3_4;

public class ArrayMethods4 {
//
	public static void main(String[]args) {
		int[] list = {27,3,5,2,6,4,7};
		System.out.println(partition(list,0,list.length));
	}
	public static int partition(int[]list1, int front, int back) {
		int i = front;
		int j = front + 1;
		int pivot = list1[front];
		while(j < back) {
			if(list1[j] <= pivot){
				i++;
				int temp = list1[j];
				list1[j] = list1[i];
				list1[i] = temp;
			}
			j++;
		}
		int temp = list1[i];
		list1[i] = list1[front];
		list1[front] = temp;
		return i;
	}
	
	public static void quickSort(int[]list1, int front, int back) {
		
	}
	
	public static void customSort(/*depends on the sort*/){
			
	}
	
	public static void printIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}
