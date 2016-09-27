package com.fizzbuzzbang;

public class FizzBuzzBangNew {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 110; i++) {
			print(i);
		}
		
	}
	
	public static String print(int i){
		if (fizz(i) && buzz(i) && bang(i)){
			System.out.println("FizzBuzzBang");
		} else if (fizz(i) && buzz(i)) {
			System.out.println("FizzBuzz");
		} else if (fizz(i) && bang(i)) {
			System.out.println("FizzBang");
		} else if (buzz(i) && bang(i)) {
			System.out.println("BuzzBang");
		} else if (fizz(i)) {
			System.out.println("Fizz");
		} else if (buzz(i)) {
			System.out.println("Buzz");
		} else if (bang(i)) {
			System.out.println("Bang");
		}
		
		String thisReturn = Integer.toString(i);

		return thisReturn;
	}
	
	public static boolean fizz (int i){
		return(i % 3 == 0);
	}
	
	public static boolean buzz (int i){
		return(i % 5 == 0);
	}
	
	public static boolean bang (int i){
		return(i % 7 == 0);
	}
}
