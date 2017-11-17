package array;

import java.util.Arrays;
/**
 * 
 * @author Jacky Lin, Brandon Channer is cool xddddddddddddddddddddddddddd
 *
 */
public class ArrayMethods {
	
	
	public static void main(String[] args) {
	int [] intArray = {1,3,2,2,3,1,2,5,7,1,2};
	int [] intArray2 = {2,4,6,8,10};
	int [] copy = copyArray(intArray);
	printArray(removeDuplicates(copy));
	//System.out.println(Arrays.deepToString(productArray(intArray,intArray2)));
	int [][] triangle = pascalTriangle(5);
	printPascalTriangle(triangle);
	}
	
	
	//Removes duplicates from input array
    public static int[] removeDuplicates(int[] list){
        int x = 0;
        int[] intermediateArr = new int[list.length];
        int[] resultArr;
        for(int i = 0; i < list.length; i++){

            //Checks if the number at list[i] already exists in intermediateArr
            if(checkDupes(intermediateArr, list[i])==false){

                //If it doesn't exist, insert it.
                intermediateArr[x] = list[i];
                x++;
            }
        }

        //Finds the length of the intermediateArr
        int length = checkLength(intermediateArr);

        //Creates a new array of the same length of the supposed array without dupes
        resultArr = new int[length];

        //Copes all elements from intermediateArr into resultArr
        for(int j = 0; j < length; j++){

            resultArr[j] = intermediateArr[j];
        }

        return resultArr;

    }
//This method counts the length of an array, stopping at 0
    public static int checkLength(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                break;
            }
            count++;
        }
        return count;
    }

    //This methods checks if the input number already exists in the array
    public static boolean checkDupes(int[] arr, int num){

        boolean duplicates = false;
        for(int i = 0; i < arr.length; i++){

            if(num == arr[i]){
                duplicates = true;
                break;
            }
        }
        return duplicates;
    }

	// multiplies the items at each position 
	public static int[][] productArray (int [] arr1, int [] arr2){
		int [][] product = new int[arr1.length][arr2.length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				product[i][j] = arr1[i] * arr2[j];
			}
		}
		return product;
	}
	
	public static int[][] pascalTriangle(int n)
	{
		int[][] triangle = new int[n][];
		//until it goes through each row in the 2d array
		for (int i = 0; i < triangle.length; i++)
		{
			//determines how many items are in each row.
			triangle[i] = new int [i + 1];
			for (int j = 0; j < triangle[i].length; j++)
			{
				//adds a 1 if the current position is either the first item or last.
				if (j == 0 || j == triangle[i].length - 1)
				{
					triangle[i][j] = 1;
				}
				else
				{
					//in a pascal triangle if you add the two values next to each other on one row, the bottom will be the sum of the two values.
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}
		}
		return triangle;
	}
	public static void printPascalTriangle(int[][] triangle)
	{
		
		for (int i = 0; i < triangle.length; i++)
		{
			int spaces = triangle.length-i;
			for(int j = spaces; j > 0; j--) {
				System.out.print(" ");
			}
			for (int t = 0; t < triangle[i].length; t++)
			{
				System.out.print(triangle[i][t] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "] ");
		}
		System.out.println();
	}
	

	public static int[] copyArray(int[] intArray) {
		int[] copy = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++) {
			copy[i] = intArray[i];
		}
		return copy;
	}
	
}


