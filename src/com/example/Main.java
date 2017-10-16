package com.example;

public class Main {

    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        StringBuilder parenthOrder = new StringBuilder();
        if (s.length() == 0) {
            return true;
        }
        if(s.length()%2==1){
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '{') {
                parenthOrder.append("}");
            }
            if (s.charAt(i) == '[') {
                parenthOrder.append("]");
            }
            if (s.charAt(i) == '(') {
                parenthOrder.append(")");
            }
            if (s.charAt(i) == '}') {
                if(parenthOrder.length()==0 || parenthOrder.charAt(parenthOrder.length()-1)!='}'){
                    return false;
                } else {
                    parenthOrder.deleteCharAt(parenthOrder.length()-1);
                }
            }
            if (s.charAt(i) == ']') {
                if(parenthOrder.length()==0 || parenthOrder.charAt(parenthOrder.length()-1)!=']'){
                    return false;
                } else {
                    parenthOrder.deleteCharAt(parenthOrder.length()-1);
                }
            }
            if (s.charAt(i) == ')') {
                if(parenthOrder.length()==0 || parenthOrder.charAt(parenthOrder.length()-1)!=')'){
                    return false;
                } else {
                    parenthOrder.deleteCharAt(parenthOrder.length()-1);
                }
            }
        }
        if(parenthOrder.length()==0) {
            return true;
        }
        return false;
    }
}
