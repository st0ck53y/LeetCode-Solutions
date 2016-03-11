package com.st0ck53y.leetcode.five;

import java.util.Arrays;

public class Solution {
    /* Brute force approach, starting from string[0] to longest palindrome, and incrementing. WILL BE SLOW :( */
    public String oldLongestPalindrome(String s) {
    	if (s.length() == 0) return "";
    	String longest = s.substring(0,1);//the currently longest palindrome found, starts as the first letter
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.lastIndexOf(s.charAt(i)) + 1; j++) {
                String p = s.substring(i, j);
                if (isPalindrome(p)) {
                	if (p.length() > longest.length()) longest = p;
                }
            }
        }
        return longest;
    }
    
    /* possibly less brutey way? O(n) instead of O(n^2) anyway, so hopefully faster*/
    public String longestPalindrome(String s) {
    	if (s==null || s.length() == 0) return "";
    	char[] longest = new char[]{'|',s.charAt(0),'|'};
    	char[] ca = fluffString(s);
    	for (int i = 1; i < ca.length; i++) { //start at 1 because s[0] has already been used to initialise the palindrome
    		int d = Math.min(i, ca.length - i); //shortest distance to edge of array (largest possible palindrome centred on ca[i];
    		int cd = 0; //The span of the largest check
    		for (int j = 1; j < d; j++) {
    			if (ca[i - j] == ca[i + j]) cd = j; //check the chars spreading out from centre char
    			else break;
    		}
    		char[] p = Arrays.copyOfRange(ca,i-cd,i+cd+1);
    		if (p.length > longest.length || (p.length == longest.length && p[0] != '|')) longest = p;//if same length as longest, but doesn't start with buffer, = new longest
    	}
    	return removeFluff(longest);
    }
    
    /*
     * creates an array of an odd number of elements, no matter what string is passed.
     * Any symmetry, or in this case any palindromes, are still present, merely extended to have some buffers within them between the letters
     */
    public char[] fluffString(String s) {
    	char[] sca = s.toCharArray();
    	char[] fca = new char[(sca.length * 2) + 1]; 
    	for (int i = 0; i < sca.length; i++) {
    		fca[i * 2] = '|';
    		fca[i * 2 + 1] = sca[i];
    	}
    	fca[sca.length * 2] = '|';
    	return fca;
    }
    
    /*
     * removes the buffer characters and return as a string
     */
    public String removeFluff(char[] ca) {
    	if (ca.length == 1) return new String(ca);
    	int len, offs;
    	if (ca[0] == '|' && ca[ca.length - 1] == '|') {
    		len = (ca.length-1)/2;
    		offs = 0;
    	} else {
    		len = ca.length / 2;
    		offs = 1;
    	}
    	char[] ret = new char[len + offs];
    	for (int i = 0; i < len + offs; i++) {
    		ret[i] = ca[(i*2)+(1-offs)];
    	}
    	return new String(ret);
    }
    
    public boolean isPalindrome(String s) {
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
    			return false;
    		}
    		if (i > (s.length() - (i + 1))) { //if past midway without fail, must be palindrome
    			return true;
    		}
    	}
    	return true; //for single char palindromes? (when i == s.length && (i <= s.length - i))
    }
}
