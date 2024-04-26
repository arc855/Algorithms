package com.twodimensional.array;

import java.util.*;

public class SortMatrix {
    public void sortMatrix(int[][] arr){
        int[][] twoDarray = new int[][]{{1,2},{0,2},{9,6},{10,9}};
        int n = arr.length;

        for(int i=0; i<n ; i++){
            int temp;
            for(int j=0; j<arr[i].length-1;j++){
                System.out.println("ith lenght : "+arr[i][j+1]);

                if(arr[i][j] > arr[i][j+1]){
                    System.out.println("count");
                    temp = arr[i][j];
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = temp;
                }

            }


        }



        for(int i =0 ;i<n;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void sortGivenMatrix(int[][] arr , int h){
        int[] temp = new int[h*h];
        int k=0;

        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                temp[k++] = arr[i][j];
            }
        }

        Arrays.sort(temp);
        k=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
               arr[i][j] =  temp[k++];
            }
        }

        for(int i =0 ;i<h;i++){
            for(int j=0; j<h;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }



}
