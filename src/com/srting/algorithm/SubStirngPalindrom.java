package com.srting.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SubStirngPalindrom {

    public void subStrings(String str){
        int n = str.length();
        ArrayList<String> strlist = new ArrayList<String>();
        for(int i = 0;i<n;i++){
            String subStr = "";
            for(int j=i ; j<n;j++ ){
                subStr += str.charAt(j);
                strlist.add(subStr);
            }
        }
        System.out.println(strlist.toString());
        for(int i = 0; i<strlist.size(); i++){
            String subStr = strlist.get(i);
            int j=0, l=subStr.length()-1; boolean flag = true;
            while(j<=l/2){
                if(subStr.charAt(j) !=subStr.charAt(l) ){
                    flag = false;
                }
                j++;l--;
            }
            if(flag == true && subStr.length()>1){
                System.out.println(strlist.get(i));
            }
        }

    }




    public void findAllSubStringPalindrom(String str){
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j<=n; j++){
                PalindromString palindromString = new PalindromString();
               String subStr = str.substring(i,j);
                if(palindromString.isPalindrom(subStr) && subStr.length()>1){
                    System.out.println("sub string is : "+str.substring(i,j));
                }
            }
        }

    }
}
