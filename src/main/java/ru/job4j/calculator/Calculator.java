package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;

        one = 6;
        int sixDivTwo = one / two;

        one = 5;
        int fiveMinusTwo = one - two;

       one = 4;
        int fourTimeTwo = one * two;

        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
