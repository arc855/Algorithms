package com.linkedlist.algorithm;

import java.util.*;

public class SortAlphanumeric {

    public void sortAlphaNumeric(String[] str){
        int n = str.length;
        for(int i=0;i<n;i++){
            System.out.print(str[i] + " ");
        }

        for(int i=0;i<str.length;i++){
            String string=str[i].replaceAll("[^A-Za-z]", "");
            String num=str[i].replaceAll("[^0-9]", "");
            char[] strarry = string.toCharArray();
            char[] numarry = num.toCharArray();
            Arrays.sort(strarry);
            String sortedStr = new String(strarry);
            char temp;
            for(int j=0;j<numarry.length-1;j++){
                if(numarry[j]>numarry[j+1]){
                    temp = numarry[j];
                    numarry[j] = numarry[j+1];
                    numarry[j+1] = temp;
                }
            }
            String sortedNum = new String(numarry);
            str[i] = sortedStr+sortedNum;
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(str[i] + " ");
        }

    }
}
