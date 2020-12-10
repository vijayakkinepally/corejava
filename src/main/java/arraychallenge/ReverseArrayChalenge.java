package arraychallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChalenge {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of the Array");
		
		int arraySize = scanner.nextInt();
		
		int[] newArray = new int[arraySize];
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println("Enter Array elements");
			newArray[i]= scanner.nextInt();
		}
		
		System.out.println("Non Reversed Array" + Arrays.toString(newArray));
		
		modifyArray(newArray);
		
		System.out.println("Reversed Array" + Arrays.toString(newArray));
		
	}

	private static void modifyArray(int[] newArray) {
		
		int tempLength = 1;
		int currentElement, lastElement;
		
		for(int i = 0; i<newArray.length/2;i++) {
			currentElement = newArray[i];
			lastElement = newArray[newArray.length - tempLength];
			newArray[i] = lastElement;
			newArray[newArray.length - tempLength] = currentElement;
			tempLength++;
		}
	}

}
