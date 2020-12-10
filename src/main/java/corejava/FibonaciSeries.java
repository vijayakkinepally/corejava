package corejava;

import java.util.Scanner;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		int n=0;
		int t=1;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		palindrome(scanner.next());
		scanner.close();
	}
	
	public int recursion(int n) {
		
		palindrome("");
		return n+recursion(n);
		
	}
	
	public static void palindrome(String input) {
	
		StringBuilder sb = new StringBuilder();
		for(int i=input.length()-1;i>=0;i--) {
			sb = sb.append(input.charAt(i));
		}
		if(input.equalsIgnoreCase(sb.toString())) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}

}
