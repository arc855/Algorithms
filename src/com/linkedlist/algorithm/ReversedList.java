package com.linkedlist.algorithm;

import java.util.Collections;
import java.util.List;

public class ReversedList {

    public List<Integer> reverseList(List<Integer> a){
//        Collections.reverse(a);
        System.out.println(a);
        int j=a.size()-1;
        for(int k=0; k<j; k++){
                a.add(k,a.remove(j));
        }
        return a;
    }
}
