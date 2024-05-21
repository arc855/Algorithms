package com.srting.algorithm;

public class StringConstruction {
    public int stringConstruction(String str) {
        char[] charry = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charry[i] = str.charAt(i);
        }
        boolean alphabetsmall[] = new boolean[26];
        for (int i = 0; i < charry.length; i++)
        {
            alphabetsmall[charry[i] - 97] = true;
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
        {
            if (alphabetsmall[i])
            {
                count++;
            }
        }
        return count;
    }
}
