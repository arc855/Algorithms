package com.twodimensional.array;

import java.util.Arrays;

public class MakeWholeRowColZero {
    //make whole row and column make zero if you find any where zero in an array;

    public void makeRowColZeroIfZero(int[][] arr){
        int l=arr.length;
        for(int i=0; i<l; i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    for(int k=0 ; k<arr[i].length;k++){
                        arr[i][k] = 0;
                    }
                }
            }
        }

        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
