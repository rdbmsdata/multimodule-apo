package org.multipmodule.core;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest  
{
	@Test
	public void testHello() {
		String str = "Hello";
		assertEquals("Hello", str);
	}
}
