package com.array.algorithm;

public class ReverseArray {
    public int[] reverseAnArray(int[] arr){
        int n= arr.length;
        int i=0 , temp;
        while(i<=n/2){
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            i++;
            n--;
        }

        return arr;
    }
}
