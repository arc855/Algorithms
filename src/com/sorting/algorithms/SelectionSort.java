package com.sorting.algorithms;

import java.util.Arrays;

public class SelectionSort {
     public void selectionSortingTeq(int[] myArray){
         int l=myArray.length;
         for(int i=0 ;i<l-1;i++){
             for(int j=i+1;j<l;j++){
                 if(myArray[j] < myArray[i]){
                     int temp = myArray[j];
                     myArray[j] = myArray[i];
                     myArray[i] = temp;
                 }
             }
         }
         System.out.println("Selection Sorted Arryas:" + Arrays.toString(myArray));
     }
}
