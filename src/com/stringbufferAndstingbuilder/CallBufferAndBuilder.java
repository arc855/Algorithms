package com.stringbufferAndstingbuilder;

public class CallBufferAndBuilder {

    public void callBuffer(){
        StringBuffer str = new StringBuffer("Hello"); //create a mutable sequence of characters ...
        str.append(" Archana !");
        System.out.println(str);

        String s = new String("hello "); //immutable !
        String a = s.concat("Ammu !");
        System.out.println(s);
        System.out.println(a);

    }
    public void callBuilder(){
        StringBuilder str = new StringBuilder("Hello");
        str.append(" Void Space XYZ !");
        System.out.println(str);
    }
}
