package com.ranjan.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringJUnit4ClassRunner .class)
//@SpringBootTest
public class TestCaseOne {
	
	@Test
	public void test() {
		String str = "Hello";
		assertEquals("Hello", str);
	}

}
