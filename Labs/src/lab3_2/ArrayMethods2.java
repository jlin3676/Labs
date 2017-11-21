package lab3_2;

public class ArrayMethods2 {
	public static void main(String [] args)
	{
		String[] test1 = {"a", "b", "c"};
		String[] test2 = {"f","g","z"};
		String[] meme = merge(test1, test2);
		printArray(meme);
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
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
}


