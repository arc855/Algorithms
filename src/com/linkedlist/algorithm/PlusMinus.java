package com.linkedlist.algorithm;

import java.util.List;

public class PlusMinus {
    public void plusMinus(List<Integer> arr) {
        // Write your code here
        int l = arr.size();
        double pstvCount = 0;
        double ngtvCount = 0;
        double zCount = 0;

        for(int i=0;i<l;i++){
            if(arr.get(i)>0){
                pstvCount++;
            }
            if(arr.get(i)<0){
                ngtvCount++;
            }
            if(arr.get(i) == 0){
                zCount++;
            }
        }
        System.out.println(String.format("%.6f", pstvCount/l));
        System.out.println(String.format("%.6f", ngtvCount/l));
        System.out.println(String.format("%.6f", zCount/l));
    }
}
