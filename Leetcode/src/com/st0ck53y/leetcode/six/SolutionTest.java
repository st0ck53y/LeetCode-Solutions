package com.st0ck53y.leetcode.six;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void testConvertPayNeg1() {
		Solution solution = new Solution();
		String expected = "PAYPALISHIRING";
		String actual = solution.convert("PAYPALISHIRING", -1);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertPay1() {
		Solution solution = new Solution();
		String expected = "PAYPALISHIRING";
		String actual = solution.convert("PAYPALISHIRING", 1);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertPay3() {
		Solution solution = new Solution();
		String expected = "PAHNAPLSIIGYIR";
		String actual = solution.convert("PAYPALISHIRING", 3);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testConvertPay4() {
		Solution solution = new Solution();
		String expected = "PINALSIGYAHRPI";
		String actual = solution.convert("PAYPALISHIRING", 4);
		Assert.assertEquals(expected, actual);
	}

}
