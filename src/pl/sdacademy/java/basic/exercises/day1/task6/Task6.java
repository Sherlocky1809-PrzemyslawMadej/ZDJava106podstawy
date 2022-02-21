package pl.sdacademy.java.basic.exercises.day1.task6;

import java.util.Scanner;

public class Task6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printMultiplicationTable(6,2,5);
    }

    private static void printMultiplicationTable(int multiplier, int multiplicandMin, int multiplicandMax) {
//        for (; multiplicandMin <= multiplicandMax; multiplicandMin++) {
//            int result = multiplier * multiplicandMin;
//            System.out.println(multiplier + " * " + multiplicandMin + " = " + result);
//        }
//
        while (multiplicandMin <= multiplicandMax) {
            int result = multiplier * multiplicandMin;
            System.out.println(multiplier + " * " + multiplicandMin + " = " + result);
            multiplicandMin++;
        }
    }
}
