package com.srting.algorithm;

import java.util.Arrays;

public class Pangrams {
    public  String pangrams(String s) {
        s= s.toLowerCase();
        s = s.replace(" ","");
        int flag = 0;
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }
        Boolean[] alphabets = new Boolean[26];
        Arrays.fill(alphabets,false);

        for(int i=0;i<ch.length;i++){
            alphabets[ch[i] - 97] = true;
        }

        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i] == false){
                flag++;
            }

        }

        if(flag >0){
            return "not pangram";
        }else{
            return "pangram";
        }


    }
}
