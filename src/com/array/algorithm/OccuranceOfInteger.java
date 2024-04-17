package com.array.algorithm;

public class OccuranceOfInteger {

    public int occuranceofAnInteger(int[] arr,int n){
        int l=arr.length,count=0;
        for(int i=0;i<l;i++){
            if(n == arr[i]){
                count++;
            }
        }

        return count;
    }
}
