package interfaces;

import corejava.extendabstract;

public class TestMain {
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		if(dog instanceof Animal) {
			System.out.println("Dog instance of Animal");
		}
		if(dog instanceof Dog) {
			System.out.println("Dog instance of dog");
		}
		if(dog instanceof Object) {
			System.out.println("Dog instance of object");
		}
		if(dog instanceof extendabstract) {
			System.out.println("Dog instance of object");
		}
		
		dog.canFly();
		dog.print2();
		
		System.out.println("6 is a perfect number " +isPerfectNumber(2));
	}

	
	 public static boolean isPerfectNumber(int number){
	       if(number < 1){
	           return false;
	       }
	       int totalSum = 0;
	       for(int i=1;i<number;i++){
	           if(number%i ==0){
	               totalSum = totalSum +i;
	           }
	       }
	       if(number == totalSum){
	           return true;
	       }
	       return false;
	   }
}
