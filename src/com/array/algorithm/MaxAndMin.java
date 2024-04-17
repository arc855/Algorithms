package com.array.algorithm;

public class MaxAndMin {

    public void maxAndMinValue(int arr[]){
        int n=arr.length;
        int min = arr[0],max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Min and Max value are respectively : "+min + " " +max);

    }
}
