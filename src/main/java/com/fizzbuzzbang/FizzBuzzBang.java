package com.fizzbuzzbang;

public class FizzBuzzBang {
	
	
	public static String print(int i){
		
		if (fizz(i) && buzz(i) && bang(i)){
			return "FizzBuzzBang";
		} else if (fizz(i) && buzz(i)) {
			return "FizzBuzz";
		} else if (fizz(i) && bang(i)) {
			return "FizzBang";
		} else if (buzz(i) && bang(i)) {
			return "BuzzBang";
		} else if (fizz(i)) {
			return "Fizz";
		} else if (buzz(i)) {
			return "Buzz";
		} else if (bang(i)) {
			return "Bang";
		}
		
		String ourReturn = Integer.toString(i);
		
		return ourReturn;
	}
	
	public static boolean fizz(int i){
		return (i % 3 == 0);
	}
	
	public static boolean buzz(int i){
		return (i % 5 == 0);
	}
	
	public static boolean bang(int i){
		return (i % 7 == 0);
	}
	
}
