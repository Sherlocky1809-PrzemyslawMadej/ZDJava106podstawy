package pl.sdacademy.java.basic.exercises.day1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        boolean xGreaterThanY = isXGreaterThanY(x, y);
        System.out.println("If x is greater than y: " + xGreaterThanY);

        boolean threeXGreaterThanY= isThreeXGreaterThanY(x, y);
        System.out.println("If x * 3 is greater than y: " + threeXGreaterThanY);

        boolean icrematedVariables = methodFromPointC(x, y);
        System.out.println( "If y++ is smaller than ++x and --x is smaller than y++: " + icrematedVariables);

        boolean resultOfMultiply = multiplying(x, y);
        System.out.println("If x * y is even: " + resultOfMultiply);
    }

    private static boolean multiplying(int x, int y) {
        return  (x * y) % 2 == 0;
    }

    private static boolean methodFromPointC(int x, int y) {
        return  (y++ < ++x) && (--x < y++);
    }

    private static boolean isThreeXGreaterThanY(int x, int y) {
        return  (3 * x) > y;
    }

    private static boolean isXGreaterThanY(int x, int y) {
       return x > y;
    }

}
