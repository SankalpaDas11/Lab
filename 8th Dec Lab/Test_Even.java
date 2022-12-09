package com.demo.test;

import static org.junit.Assert.assertEquals; // importing assert

import org.junit.Test; // importing test

import com.demo.main.EvenTrue;

public class Test_Even {
	@Test // Test annotation
	public void test() {
		assertEquals(true,EvenTrue.findEven()); // running test cases
	}
}
