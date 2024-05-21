package com.array.algorithm;

public class StairCase {
    public  void staircase(int n) {
        // Write your code here
        int i, j;
        for(i=0; i<n; i++) {
            for(j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
