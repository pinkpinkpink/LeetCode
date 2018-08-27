package com.leetcode13;/*
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

public class RomanNumberToInteger {
    public String RomanNumberToInteger(String s) {
        s = s + 'I';
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            int now1 = CharTransInteger(c1);
            int now2 = CharTransInteger(c2);

            result = result;

        }
    }
    return 0;
}
