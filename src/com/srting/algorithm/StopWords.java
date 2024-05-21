package com.srting.algorithm;


import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StopWords {
    public static String stopwordsStripped(String paragraph, String[] stopWords) {
        List<String> finalResult = new ArrayList<String>();
        List<String> words = Arrays.asList(paragraph.split(" "));
        List<String> stopwordsList = Arrays.asList(stopWords);
        for (String word : words) {
            if (!stopwordsList.contains(word)) {
                finalResult.add(word);
            }
        }
        String result = String.join(" ", finalResult) + ".";
        return result;
    }
}