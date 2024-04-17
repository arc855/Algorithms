package com.array.algorithm;

public class KthLargestAndSmallestElement {
    public int kthLargestvalue(int[] arr,int n){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1; j<l;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-1];

    }


    public int kthsmallestvalue(int[] arr,int n){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1; j<l;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-1];

    }

}
