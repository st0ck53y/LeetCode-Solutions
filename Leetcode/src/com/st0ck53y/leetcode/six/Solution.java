package com.st0ck53y.leetcode.six;

public class Solution {
	public String convert(String s, int numRows) {
		if (s == null || s.equals("")) return "";
		if (numRows < 2) return s;
        String[] zig = new String[numRows];
        for (int i = 0; i < numRows; i++) {
        	zig[i] = ""; //initialise array
        }
        int cr = 0; //current row of zig
        boolean up = false; //direction of zig
        for (int i = 0; i < s.length(); i++) {
        	zig[cr] += s.charAt(i);
        	if (up) {
        		if (cr == 0) {
        			up = false;
        			cr++;
        		} else {
        			cr--;
        		}
        	} else {
	        	if (cr == (numRows - 1)) {
	        		up = true;
	        		cr--;
	        	} else {
	        		cr++;
	        	}
        	}
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
        	sb.append(zig[i]); //compile into single string
        }
        return sb.toString();
    }
}
