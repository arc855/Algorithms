package com.srting.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

    public boolean isStringAnagram(String str1, String str2){
        int l1=str1.length(), l2=str2.length();
        char[] ch1 = str1.toCharArray(), ch2 = str2.toCharArray();

        if(l1 !=l2){
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<l1;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }

        return true;
    }
}
