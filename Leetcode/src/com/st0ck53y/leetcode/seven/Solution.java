package com.st0ck53y.leetcode.seven;

public class Solution {
	public int reverse(int x) {
		if (x == Integer.MIN_VALUE) return 0;
        boolean neg = false;
        if (x < 0) {
        	neg = true;
        	x = -x;
        }
        int num = 0;
        String val = String.valueOf(x);
        int size = val.length() - 1;
        int dord = (int)Math.pow(10, size);
        int iord = 1;
        for (int i = size; i >= 0; i--) {
        	num += ((x / dord) % 10) * iord;
        	dord /= 10;
        	iord *= 10;
        }
        if (((num / (int)Math.pow(10, size)) % 10) != x % 10) return 0;
		return (neg ? -num : num);
    }
}
