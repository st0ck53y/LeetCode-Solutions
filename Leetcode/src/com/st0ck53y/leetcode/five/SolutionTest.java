package com.st0ck53y.leetcode.five;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLongestPalindromeNoInput() {
		Solution solution = new Solution();
		String expected = "";
		String actual = solution.longestPalindrome("");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeSingleCharInput() {
		Solution solution = new Solution();
		String expected = "a";
		String actual = solution.longestPalindrome("a");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testLongestPalindromeTwoCharNoPalindrome() {
		Solution solution = new Solution();
		String expected = "a";
		String actual = solution.longestPalindrome("ab");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeTwoCharPalindrome() {
		Solution solution = new Solution();
		String expected = "aa";
		String actual = solution.longestPalindrome("aa");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeThreeCharPalindrome() {
		Solution solution = new Solution();
		String expected = "aba";
		String actual = solution.longestPalindrome("aba");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeThreeCharNoPalindrome() {
		Solution solution = new Solution();
		String expected = "a";
		String actual = solution.longestPalindrome("abc");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeThreeCharInputTwoCharPalindromeStart() {
		Solution solution = new Solution();
		String expected = "aa";
		String actual = solution.longestPalindrome("aab");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeThreeCharInputTwoCharPalindromeEnd() {
		Solution solution = new Solution();
		String expected = "bb";
		String actual = solution.longestPalindrome("abb");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeFiveCharPalindrome() {
		Solution solution = new Solution();
		String expected = "abcba";
		String actual = solution.longestPalindrome("abcba");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeTenCharInputFiveCharPalindrome() {
		Solution solution = new Solution();
		String expected = "abcba";
		String actual = solution.longestPalindrome("zrabcbaump");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeDualPalindrome() {
		Solution solution = new Solution();
		String expected = "abcbabcba";
		String actual = solution.longestPalindrome("abcbabcba");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestPalindromeVeryLongPalindrome() {
		Solution solution = new Solution();
		String expected = "pbqbp";
		String actual = solution.longestPalindrome("slvafhpfjpbqbpcuwxuexavyrtymfydcnvvbvdoitsvumbsvoayefsnusoqmlvatmfzgwlhxtkhdnlmqmyjztlytoxontggyytcezredlrrimcbkyzkrdeshpyyuolsasyyvxfjyjzqksyxtlenaujqcogpqmrbwqbiaweacvkcdxyecairvvhngzdaujypapbhctaoxnjmwhqdzsvpyixyrozyaldmcyizilrmmmvnjbyhlwvpqhnnbausoyoglvogmkrkzppvexiovlxtmustooahwviluumftwnzfbxxrvijjyfybvfnwpjjgdudnyjwoxavlyiarjydlkywmgjqeelrohrqjeflmdyzkqnbqnpaewjdfmdyoazlznzthiuorocncwjrocfpzvkcmxdopisxtatzcpquxyxrdptgxlhlrnwgvee");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsPalindrome() {
		Solution solution = new Solution();
		boolean actual = solution.isPalindrome("abcba");
		Assert.assertTrue(actual);
		actual = solution.isPalindrome("abcbabcba");
		Assert.assertTrue(actual);
		actual = solution.isPalindrome("abp");
		Assert.assertFalse(actual);
		actual = solution.isPalindrome("abcbac");
		Assert.assertFalse(actual);
	}
	
	@Test
	public void testFluffString() {
		Solution solution = new Solution();
		char[] expected = new char[]{'|','a','|'};
		char[] actual = solution.fluffString("a");
		Assert.assertArrayEquals(expected, actual);
		expected = new char[]{'|','a','|', 'b', '|'};
		actual = solution.fluffString("ab");
		Assert.assertArrayEquals(expected, actual);
		expected = new char[]{'|','a','|','b','|','c','|','|','|'};
		actual = solution.fluffString("abc|");
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testRemoveFluff() {
		Solution solution = new Solution();
		String expected = "a";
		String actual = solution.removeFluff(new char[]{'|','a','|'});
		Assert.assertEquals(expected, actual);
		expected = "ab";
		actual = solution.removeFluff(new char[]{'|','a','|', 'b','|'});
		Assert.assertEquals(expected, actual);
		expected = "abc|";
		actual = solution.removeFluff(new char[]{'|','a','|','b','|','c','|','|','|'});
		Assert.assertEquals(expected, actual);
		
		expected = "a";
		actual = solution.removeFluff(new char[]{'a'});
		Assert.assertEquals(expected, actual);
		expected = "ab";
		actual = solution.removeFluff(new char[]{'a','|','b'});
		Assert.assertEquals(expected, actual);
		expected = "abc|";
		actual = solution.removeFluff(new char[]{'a','|','b','|','c','|','|'});
		Assert.assertEquals(expected, actual);
	}
}
