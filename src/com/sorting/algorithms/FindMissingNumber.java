package com.sorting.algorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMissingNumber {

    public int findMissinNumber(List<Integer> arr){
        Collections.sort(arr);
        int key =0 ;

        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)+1 != arr.get(i+1)){
                key = arr.get(i);
                break;
            }
        }
        return key+1;
    }
}
