package arraychallenge;

import java.util.Scanner;

public class MinElementChallenge {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the count");
		
		int count = scanner.nextInt();
		
	
		int[] inputArray = readIntegers(count);
		
		findMin(inputArray);

	}

	private static void findMin(int[] inputArray) {
		
		int temp = inputArray[0];
		for(int i=0; i<inputArray.length;i++) {
			System.out.println("Enter number");
			if(inputArray[i] < temp) {
				temp = inputArray[i];
			}
		}
		
		System.out.println("Minimum element in the array " +temp);
		
	}

	private static int[] readIntegers(int count) {
		
		int[] array = new int[count];
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
		}
		return array;
		
	}

}
