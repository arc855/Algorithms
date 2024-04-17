package com.array.algorithm;

public class SumOfIntergersValue {

    public void integerSumEqValue(int[] arr,int sumvalue){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == sumvalue ){
                    System.out.println("Two integers are : "+arr[i]  +" "+arr[j]);
                }
            }
        }
    }
}
