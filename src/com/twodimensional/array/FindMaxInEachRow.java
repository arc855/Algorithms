package com.twodimensional.array;

public class FindMaxInEachRow {

    public void findMaxInEachRow(int[][] arr){
        int n = arr.length;
        int[] temparr = new int[0];

        for(int i=0; i<n;i++){
            for(int j= 0 ; j<arr[i].length-1;j++){
                if(arr[i][j] > arr[i][j+1]){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = temp;
                }
            }
        }

        for(int[] el:arr){
            System.out.println(el[el.length-1]);
        }

    }
}
