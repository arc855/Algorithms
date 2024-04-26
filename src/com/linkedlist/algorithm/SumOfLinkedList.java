package com.linkedlist.algorithm;

import com.sorting.algorithms.InsertionSort;

import java.util.LinkedList;

public class SumOfLinkedList {
    public int sumOfLinkedList(LinkedList<Integer> lnklist){
        int sum = 0;
        for(Integer el : lnklist){
            sum+=el;
        }

        return sum;
    }

}
