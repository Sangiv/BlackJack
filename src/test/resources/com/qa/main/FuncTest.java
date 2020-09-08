package com.qa.main;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.main.Func;

public class FuncTest {
	
	static Func blackjack;
	
	@BeforeClass
	public static void setup() {
	    blackjack = new Func();
	}
	
//	@Before
//	public void init() {
//	    System.out.println("Before test");
//	}
	
	@Test
	public void test1() {
	    assertNotNull("Expected a String with Game Outcome", blackjack.Play());
	}

//	@Test
//	public void test2() {
//	    System.out.println("Test 2");
//	}
//	
//	@After
//	public void reset() {
//	    System.out.println("After test");
//	}
	
//	@AfterClass
//	public static void teardown() {
//	    System.out.println("After class");
//	}
	
}
