package com.demo.java.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MyCalTest {
	
	@Test
	public void positiveAdditionTest() throws Exception {
		MyCal cal = new MyCal();
		int result = cal.Addition(100, 200);
		int actualAddition = 300;
		Assert.assertEquals(actualAddition, result);
		
	}
	
	@Test
	public void negativeAdditionTest() {
		System.out.println("Test case 2 passes...");
	}
	@Test
	public void positiveAdditionTest2()  {
		System.out.println("Test case 3 passed");
		
	}
	

}
