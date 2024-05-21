package com.srting.algorithm;

public class TimeConversion {
    public  String timeConversion(String s) {
        System.out.println(s);
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        String hr = "";
        String minsec = "";
        for (int i = 0; i <2; i++) {
            hr += ch[i];
        }
        converHour(hr);
        for(int i=2;i<ch.length-2;i++){
            minsec +=ch[i];
        }
        if(s.contains("AM")){
            if(s.contains("12")){
                return "00"+minsec;
            }
            return s.replace("AM","");
        }else{
            return converHour(hr)+minsec;
        }
    }

    public static String converHour(String h){
        if(h.contains("12")){
            return "12";
        }
        int convertedHr = Integer.parseInt(h) + 12;
        return String.valueOf(convertedHr);
    }
}
