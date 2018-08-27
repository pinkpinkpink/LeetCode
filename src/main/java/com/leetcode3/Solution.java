package com.leetcode3;

import java.util.HashMap;
import java.util.Map;
 class Solution {
    public int lengthOfLongestSubString(String s) {
        int maxlenth = 0;
        int now = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                now = Math.max(map.get(s.charAt(i))+1,now);
                if(now < Math.max(map.get(s.charAt(i)),now)){
                    return now;
                }

            }
        }
        return maxlenth;
    }
}