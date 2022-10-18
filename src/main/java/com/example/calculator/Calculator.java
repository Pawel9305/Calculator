package com.example.calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator();
        System.out.println(calculator.subtraction(10, 5));
        System.out.println(calculator.sum(5, 10));
    }

    public int sum (int a, int b) {
        return a + b;
    }

    public int subtraction (int a, int b) {
        return a - b;
    }
    }

