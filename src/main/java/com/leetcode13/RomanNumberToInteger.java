package com.leetcode13;
/*
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import java.util.HashMap;

public class RomanNumberToInteger {
    public int RomanNumberToInteger(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                result = result + map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));

            }else{
                result = result + map.get(s.charAt(i));
            }

        }
            return  result;
        }

    }

