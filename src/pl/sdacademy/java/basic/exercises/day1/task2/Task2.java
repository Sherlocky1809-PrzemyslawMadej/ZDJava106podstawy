package pl.sdacademy.java.basic.exercises.day1.task2;

import java.util.Scanner;

public class Task2 {

    private static final float PI = 3.14f; // stała liczbowa na samą górę jako final.

    public static void main(String[] args) {
        float diameter = getInsertDiameter();
        float circumference = calculateCircumferenceOfCircle(diameter);
        System.out.println("Circumference of a circle: " + circumference);
        float area = calculateAreaOfACircle(diameter);
        System.out.println("Area of a circle: " + area);
    }

    float diameter;

    private static float getInsertDiameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfCircle(float diameter) {

//        return PI * diameter;
        return (float) Math.PI * diameter;
    }

    private static float calculateAreaOfACircle(float diameter) {
        float radius = diameter / 2;
        return (float) Math.PI * radius * radius;
    }

}
