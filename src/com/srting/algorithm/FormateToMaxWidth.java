package com.srting.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormateToMaxWidth {

    public  List<String> justify(String[] words, int maxWidth) {
        List<String> wordList = Arrays.asList(words);
        List<String> result = new ArrayList<>();
        List<String> wordsSub = new ArrayList<>();
        int i = 0;

        while (i < wordList.size()) {
            wordsSub.add(wordList.get(i));

            if (getLength(wordsSub) < maxWidth) {
                i++;
            }

            if (getLength(wordsSub) >= maxWidth) {
                wordsSub = wordsSub.subList(0, wordsSub.size() - 1);
                result.add(matchLength(wordsSub, maxWidth));
                wordsSub.clear();
            }
        }

        result.add(matchLength(wordsSub, maxWidth));
        return result;
    }

    private static int getLength(List<String> words) {
        int length = 0;
        for (String word : words) {
            length += word.length() + 1;
        }
        return length - 1;
    }

    private static String matchLength(List<String> words, int maxWidth) {
        int spaces = maxWidth - getLength(words);
        int numSpaces = words.size() - 1;
        if (numSpaces == 0) {
            return words.get(0) + " ".repeat(spaces);
        }
        int spacesPerGap = spaces / numSpaces;
        int extraSpaces = spaces % numSpaces;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) {
                sb.append(" ".repeat(spacesPerGap + (i < extraSpaces ? 1 : 0)));
            }
        }
        return sb.toString();
    }
}
