package com.twodimensional.array;

public class Basics {

    public void declareAndPrint2DArray(){
        int[][] twoDarray = new int[][]{{1, 2}, {7, 49},{1, 2}, {7, 49}};
        int l = twoDarray.length;

        for(int i = 0 ; i<l ; i++){
            for(int j=0 ; j<twoDarray[i].length; j++){
                System.out.println("value at index "+ i + j+ " is : " +twoDarray[i][j]);
            }
        }

    }


}
