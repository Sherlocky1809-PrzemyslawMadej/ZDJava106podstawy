package pl.sdacademy.java.basic.exercises.day1.task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        int a = sumOfSequence(firstDigit, secondDigit);
        System.out.print("Sum: " + a);
    }

    private static int sumOfSequence(int firstDigit, int secondDigit) {
        if (firstDigit > secondDigit) {
            //zamiana miejscami
            int x = firstDigit;
            firstDigit = secondDigit;
            secondDigit = x;
            //return -1;
        }

        int sum = 0;

        while (firstDigit <= secondDigit) {
            sum += firstDigit;
            firstDigit++;
        }
        return sum;
    }

}
