package com.srting.algorithm;

public class StringBasics {
    public void basicsOfStrings(){
        String name  = "archana";
        String strLiteral = "archana";
        String strObj = new String("archana");
        name.concat("PS");
        System.out.println("my name is :"+ name);
        System.out.println("my name is :"+ name.concat(" GS"));
        System.out.println("Address checking :"+ (name == name.concat(" GS") ));
        System.out.println("Address checking with diff variable and same name  :"+ name.equals(strLiteral) );
        System.out.println("Address checking with diff variable and same name  :"+ (name == strLiteral) );
        System.out.println("Address checking with sting object diff variable and same name  :"+ (name == strObj) );
    }

    public static boolean isUpperCase(String str){
        return str.chars().allMatch(Character :: isUpperCase);
    }

    public static boolean isLowecase(String str){
        return str.chars().allMatch(Character :: isLowerCase);
    }
    public static boolean isDigit(String str){
        return str.chars().allMatch(Character :: isDigit);
    }

    public boolean isPasswordComplex(String str){
        return str.chars().anyMatch(Character :: isUpperCase) &&
                str.chars().anyMatch(Character :: isLowerCase) &&
                str.chars().anyMatch(Character :: isDigit);
    }

    public  String normalizeStringData(String strToBeNormalized){
        return strToBeNormalized.toLowerCase().trim().replace(",","");
    }

    public void firstOccurance(String str){
        str.lastIndexOf('e');
        str.indexOf('r');
    }

}
