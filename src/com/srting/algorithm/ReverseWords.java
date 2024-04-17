package com.srting.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String str){
        String[] words = str.split( " ");
        List<String> filterwords = new ArrayList<String>();
        for(String word : words){
            if(!word.equals("")){
                filterwords.add(word);
            }
        }
        Collections.reverse(filterwords);
        return String.join(" ",filterwords);
    }
}
