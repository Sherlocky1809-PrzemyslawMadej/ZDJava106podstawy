package pl.sdacademy.java.basic.exercises.day1.task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String decision; // String decision = null;
        do {
            System.out.println("calculating...");
            System.out.print("New calculation or 'Stop'");
            decision = scanner.nextLine();
        } while (!("Stop".equalsIgnoreCase(decision))); // pierwsza wartość musi być bardziej pewna.
    }
}
