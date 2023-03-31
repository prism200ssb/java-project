package com.demo.java.calculator;


public class App {
	public static int Addition(int num1, int num2) throws Exception {
		if(num1<= 0 || num2<=0 ) 
			throw new Exception("Invalid numbers");
		else {
			int result =0;
			result = num1 + num2;
			return result;
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Addition of given number is " +Addition(10,20));
		
	}
	
}    
