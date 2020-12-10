package arraychallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = null;

		int arrayLength, temp;

		System.out.println("Enter the length of the array");

		

		array = new int[scanner.nextInt()];

		arrayLength = array.length;

		System.out.println("Enter Array elements");

		for (int i = 0; i < arrayLength; i++) {
			array[i] = scanner.nextInt();
		}
		
		int[] originalArray = Arrays.copyOf(array, arrayLength);

		
		
		getIntegers(originalArray);

		printArray(array, "print Array");

		sortIntegers(array);

		largestNumberOfArray(array);

		scanner.close();

	}

	private static void getIntegers(int[] originalArray) {
		System.out.println("Enter Array elements");

		for (int i = 0; i < originalArray.length; i++) {
			originalArray[i] = scanner.nextInt();
		}
		
	}

	private static void printArray(int[] array, String message) {
		System.out.println(message);
		for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);

		}
	}

	private static void sortIntegers(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (i < j) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}
		printArray(array,"Integers in descending order");
	}
	
	
	private static void largestNumberOfArray(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length; i++) {
         if(array[i] > temp) {
        	 temp = array[i];
         }
		

		}
		System.out.println("Largest number in the array " +temp);
	}

}
