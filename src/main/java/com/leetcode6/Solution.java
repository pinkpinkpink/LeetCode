package com.leetcode6;

public class Solution {
    public String convert(String s,int numRows){

        if(numRows == 0) return s;

        StringBuilder sbr = new StringBuilder();
        int n = s.length();
        //行0的字位符位于索引k(2 * numRows -2)
        int cycleLen = 2 * numRows -2;

        for(int i = 0; i < numRows;i++){
            for(int j = 0; j + i < n; j += cycleLen){
                sbr.append(s.charAt(j + i));
                if(i != 0 && i != numRows - 1 && j + cycleLen - 1< n)
                    sbr.append(s.charAt(j + cycleLen - 1));


            }

        }

        return sbr.toString();

    }


}
