package com.array.algorithm;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public  int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int len = candles.size();
        Collections.sort(candles);
        int tallestCandle = candles.get(len-1);
        int count = 0;
        System.out.println(candles.get(len-1));
        for(int candle : candles){
            if(candle == tallestCandle){
                count++;
            }
        }
        return count;
    }

}
