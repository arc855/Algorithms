package com.linkedlist.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public  List<Integer> gradingStudents(List<Integer> grades) {
        Integer failing_grade = 38;
        System.out.println("Input : "+grades);
        System.out.println("expected : "+"75 67 40 33");

        List<Integer> resultant_list = new ArrayList<>();
        for(Integer el : grades){
            Integer temp = el;
            if(el<failing_grade){
                resultant_list.add(el);
            }else{
               while(!(el%5==0)){
                   el++;
               }
               System.out.println("el : "+ (el));
               if(el-temp < 3){
                   resultant_list.add(el);
               }else{
                   resultant_list.add(temp);
               }

            }


        }
        return resultant_list;

    }
}
