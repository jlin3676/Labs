package lab3_2;
import java.util.Arrays;
/**
 * 
 * @author Jacky Lin, Brandon Channer
 *
 */
public class ArrayMethods2 {
	public static void main(String [] args)
	{
		String[] test1 = {"a", "b", "c"};
		String[] test2 = {"f","g","z"};
		String [] test3 = {"a", "b", "c","l","z","m","k",};
		String[] meme = merge(test2, test1);
		printArray(meme);
		printArray(mergeSort(test3));
	}

	public static String[] merge(String[] list1, String[] list2) {
		String[] result = new String[list1.length + list2.length];
			int one = 0;
			int two = 0;
			while(true) {
				if(one >= list1.length) {
					for(int i = two; i < list2.length; i++) {
						result[list1.length + i] = list2[i];
					}
					break;
				}
				if(two >= list2.length) {
					for(int i = one; i < list1.length; i++) {
						result[list2.length + i] = list1[i];
					}
					break;
				}
				// compareTo will return a value of -1, 0, 1.
				// -1 means that the second item is greater.
				// 0 means that the two items are equal.
				// 1 means that the first item is greater than the second.
				if(list1[one].compareTo(list2[two]) < 0 ) 
				{
					result[one + two] = list1[one];
					one++;
					continue;
				}
				if(list2[two].compareTo(list1[one]) < 0 )
				{
					result[one + two] = list2[two];
					two++;
					continue;
				}
			}
		return result;
	}
	
	public static String [] mergeSort(String [] list) {
			if(list.length==1) {
				return list;
			}
			else {
				String[] arr1 = Arrays.copyOfRange(list, 0, list.length/2);
				String[] arr2 = Arrays.copyOfRange(list, list.length/2, list.length);
				return merge(mergeSort(arr1), mergeSort(arr2));
				
			}
	}
	
	public static int partition(int[] list)
	{
		int pivot = list[0];
		int counter = 0;
		for(int i = 1; i < list.length; i++)
		{
			if(list[i] <= pivot)
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}


