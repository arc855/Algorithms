package com.linkedlist.algorithm;

import java.util.Stack;

public class HackerrankInString {

    public String hackerrankInString(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        String target = "hackerrank";

        for (int i = 0; i < target.length(); i++) {
            stack.push(target.charAt(i));
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (stack.empty()) {
                return "YES";
            }
            if (s.charAt(i) == stack.peek()) {
                stack.pop();
            }
        }
        if (stack.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
