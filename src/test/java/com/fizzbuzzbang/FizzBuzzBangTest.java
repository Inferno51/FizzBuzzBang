package com.fizzbuzzbang;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzBangTest {

	FizzBuzzBang fbb = new FizzBuzzBang();
	
	@Test
	public void printNumbers() {
		
		assertEquals("1", fbb.print(1));
		assertEquals("2", fbb.print(2));
	}

	@Test
	public void fizz(){
		assertEquals("Fizz", fbb.print(3));
	}
	
	@Test
	public void buzz(){
		assertEquals("Buzz", fbb.print(5));
	}
	
	@Test
	public void bang(){
		assertEquals("Bang", fbb.print(7));
	}
	
	@Test
	public void fizzBuzz(){
		assertEquals("FizzBuzz", fbb.print(15));
	}

	@Test
	public void fizzBang(){
		assertEquals("FizzBang", fbb.print(21));
	}
	
	@Test
	public void buzzBang(){
		assertEquals("BuzzBang", fbb.print(35));
	}
	
	@Test
	public void fizzBuzzBang(){
		assertEquals("FizzBuzzBang", fbb.print(105));
	}
}
