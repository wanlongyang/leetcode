package cn.practice.leetcode;

import java.util.Scanner;

public class RepeatedString0459 {

    /**
     * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
     *
     * 示例 1:
     * 输入: "abab"
     * 输出: True
     * 解释: 可由子字符串 "ab" 重复两次构成。
     * 示例 2:
     * 输入: "aba"
     * 输出: False
     * 示例 3:
     * 输入: "abcabcabcabc"
     * 输出: True
     * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
     */

    public boolean repeatedSubstringPattern(String s) {

        System.out.println("输入原始字符串");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        for (int i=1;i<str.length()/2;i++){
            for (int j = i; j < ; j++) {

            }
        }

        return false;
    }



}
