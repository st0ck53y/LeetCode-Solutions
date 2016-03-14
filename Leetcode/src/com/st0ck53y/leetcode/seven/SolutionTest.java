package com.st0ck53y.leetcode.seven;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void test0() {
		Solution solution = new Solution();
		int expected = 0;
		int actual = solution.reverse(0);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test10() {
		Solution solution = new Solution();
		int expected = 1;
		int actual = solution.reverse(10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNeg10() {
		Solution solution = new Solution();
		int expected = -1;
		int actual = solution.reverse(-10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1000() {
		Solution solution = new Solution();
		int expected = 1;
		int actual = solution.reverse(1000);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNeg1000() {
		Solution solution = new Solution();
		int expected = -1;
		int actual = solution.reverse(-1000);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test123() {
		Solution solution = new Solution();
		int expected = 321;
		int actual = solution.reverse(123);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testNeg123() {
		Solution solution = new Solution();
		int expected = -321;
		int actual = solution.reverse(-123);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test121() {
		Solution solution = new Solution();
		int expected = 121;
		int actual = solution.reverse(121);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNeg121() {
		Solution solution = new Solution();
		int expected = -121;
		int actual = solution.reverse(-121);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test54321() {
		Solution solution = new Solution();
		int expected = 12345;
		int actual = solution.reverse(54321);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testNeg54321() {
		Solution solution = new Solution();
		int expected = -12345;
		int actual = solution.reverse(-54321);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testMinInt() {
		Solution solution = new Solution();
		int expected = 0;
		int actual = solution.reverse(-2147483648);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testStrange() {
		Solution solution = new Solution();
		int expected = -2143847412;
		int actual = solution.reverse(-2147483412);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testUnderflow() {
		Solution solution = new Solution();
		int expected = 0;
		int actual = solution.reverse(-1345214235);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSomething() {
		Solution solution = new Solution();
		int expected = 214748364;
		int actual = solution.reverse(463847412);
		Assert.assertEquals(expected, actual);
	}
}
