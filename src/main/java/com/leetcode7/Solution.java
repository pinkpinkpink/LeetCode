package com.leetcode7;

public class Solution {
    public int reverse(int x){

        boolean negative = x < 0;
        if(negative) {x = -x;}
        long res = 0;
        while(x > 0){

            res = x % 10 + res * 10;
            x /= 10;
        }
        if(negative) {res = -res;}
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {return 0;}
        return (int) res;
    }
}




