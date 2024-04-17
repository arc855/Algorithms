package com.srting.algorithm;

public class PalindromString {

    public boolean isPalindrom(String str){
        boolean flag = false;
        RevereseString revereseString = new RevereseString();
        String reversedString = revereseString.reverseString(str);
        if( str.equals(reversedString) ){
            flag = true;
        }
        return flag;

    }

    public boolean checkPalindrom(String str){
        int l = str.length()-1;
        int i = 0;
        while(i<=l/2){
            if(str.charAt(i) != str.charAt(l)){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
}
