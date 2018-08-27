package com.leetcode9;
/*
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

import java.util.Scanner;

class Solution {
    public boolean ispalindromicnumber(int X) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个回文数");
        int num = sc.nextInt();

        String str1 = num + "";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();

        int count = 0;

        for(int i ;i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                System.out.print(str1+"不是回文数");
                break;
            }else{
                count++;
            }

            if(count == str2.charAt(i)){
                System.out.println(str2+"是回文数");
            }
        }

        sc.close();

        return;

    }

}
