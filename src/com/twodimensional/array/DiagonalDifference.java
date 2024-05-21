package com.twodimensional.array;
import java.lang.Math;


import java.util.List;

public class DiagonalDifference {
    public  int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        System.out.println(arr);
        int len = arr.size();
        int rightdSum = 0;
        int leftdSum = 0;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr.get(i) == arr.get(j)){
                    rightdSum += arr.get(i).get(j);

                }
                if(i + j == len - 1){
                    leftdSum += arr.get(i).get(j);
                }


            }
        }

        System.out.println(rightdSum);
        System.out.println(leftdSum);

        return Math.abs(rightdSum - leftdSum);

    }
}
