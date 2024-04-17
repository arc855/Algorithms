package com.srting.algorithm;

public class SearchInString {

    public boolean substringSearch(String str){
        return str.contains("ana");
    }

    public void parseContent(String str){
        for(char c : str.toCharArray()){
            System.out.println(c);
        }


        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
