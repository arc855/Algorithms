package com.linkedlist.algorithm;

import java.util.List;

public class Rotation {
    public void rightRotation(int d, List<Integer> arr){
        int l= arr.size();
        int i=0;
        while(i<d){
            arr.add(0,arr.remove(l-1));
            i++;
        }
        System.out.println(arr);
    }

    public void LeftRotation(int d, List<Integer> arr){

    }
}
