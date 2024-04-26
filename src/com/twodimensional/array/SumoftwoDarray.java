package com.twodimensional.array;

public class SumoftwoDarray {

    public int sumof2Darray(int[][] arr){
        int l = arr.length,sum=0;

        for(int i=0;i<l;i++){
            for(int j=0; j<arr[i].length;j++){
                sum=arr[i][j]+sum;
            }
        }
        return sum;
    }
}
