package com.sorting.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public  List<Integer> countingSort(List<Integer> arr) {
        // Write your code here 1,3,3

        int[] freq = new int[10];
        Arrays.fill(freq,0);
        System.out.println(Arrays.toString(freq));
        for(Integer a : arr){
            freq[a]++;
        }

        List results = new ArrayList<>();
        for(int i=0;i<10;i++){
            results.add(freq[i]);
        }
        return results;
    }
}
