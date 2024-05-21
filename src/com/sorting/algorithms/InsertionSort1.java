package com.sorting.algorithms;

import java.util.Arrays;
import java.util.List;

public class InsertionSort1 {

    public void insertionSort1(int n , List<Integer> arr){

        int len = arr.size();
        int key = arr.get(len-1);
        System.out.println("key is : "+key);

        for(int i=len-2;i>=0;--i){
            if(arr.get(i)>key){
                arr.set(i+1,arr.get(i));
            }
            if(arr.get(i)<key){
                System.out.println("====== : "+arr.get(i));
                arr.set(i+1,key);
                break;
            }

            for(int m=0;m<len;m++){
                System.out.print(arr.get(m)+" ");
            }
            System.out.println();
        }
        for(int m=0;m<len;m++){
            System.out.print(arr.get(m)+" ");
        }



    }
}
