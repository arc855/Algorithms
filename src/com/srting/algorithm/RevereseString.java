package com.srting.algorithm;

public class RevereseString {

    public String reverseString(String str){
        String reveresedStr = "";
        char ch;
        for(int i=0 ;i<str.length();i++){
            ch = str.charAt(i);
            reveresedStr = ch+reveresedStr;
        }
        return reveresedStr;
    }
}
