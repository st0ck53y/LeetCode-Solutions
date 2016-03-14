package com.st0ck53y.leetcode.seven;

public class Solution {
	public int reverse(int x) {
		if (x == Integer.MIN_VALUE || x == 0) return 0;
        boolean neg = false;
        if (x < 0) {
        	neg = true;
        	x = -x;
        }
        int num = 0;
        int div = 1;
        int od = 1;
        int val = 0;
        boolean die = false;
        do {
        	num *= 10;
        	val = (x / div) % 10;
        	num += val;
        	od = div;
        	div *= 10;
        	if (((long)num) * 10 != num * 10) {
        		die = true;
        		break;
        	}
        } while (val != 0 || (x / div) > 0);
        if (x / od > 0) return 0;
        if (!die) {
        	num /= 10;
        	od /= 10;
        }
        while (num % 10 == 0) {
        	num /= 10;
        }
        if ((num / od) == x % 10 && !neg) return num;
        num = -num;
        if (div % 10 != 0) return num;
        if (x / div != 0) return 0;
		return num;
    }
}
