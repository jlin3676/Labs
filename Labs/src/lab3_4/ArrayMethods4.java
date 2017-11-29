package lab3_4;

public class ArrayMethods4 {

	public static void partition(int[]list1, int front, int back) {
		int i = 1;
		int j;
		int pivot = list1[0];
		int pos = 0;
		int lastIdx;
		while(list1[i] > pivot) {
			i++;
			if(list1[i] < pivot) {
				int temp = list1[i];
				list1[i] = list1[1];
				list1[1] = temp;
				lastIdx = i;
			}
		}
		
	}
	
	public static void quickSort(int[]list1, int front, int back) {
		
	}
	
	public static void customSort(/*depends on the sort*/){
			
	}
	
}
