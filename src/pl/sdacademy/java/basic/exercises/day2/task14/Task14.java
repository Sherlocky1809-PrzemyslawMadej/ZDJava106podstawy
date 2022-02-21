package pl.sdacademy.java.basic.exercises.day2.task14;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5, -9};
        System.out.println("Inputs: " + Arrays.toString(inputs));
        int negativeDigits = numberOfNegativeDigits(inputs);
        if (negativeDigits > 0) {
            int[] newInputs = createNewInputs(inputs, negativeDigits);
            System.out.println("Result: " + Arrays.toString(newInputs));
        }
    }

    private static int numberOfNegativeDigits(int[] inputs) {
        int sumNegativeDigits = 0;
        for (int i : inputs) {
            if (i < 0) {
                sumNegativeDigits++;
            }
        }
        return sumNegativeDigits;
    }
    private static int[] createNewInputs(int[] inputs, int negativeDigits) {
        int[] negativeInputs = new int[negativeDigits];

        for (int i = 0, j = 0; i <inputs.length; i++) {
            if(inputs[i] < 0) {
                negativeInputs[j++] = inputs[i];
            }
        }
//        int i = 0;
//        for (int element : inputs) {
//            if (element < 0) {
//            negativeInputs[i++] = element;
//            }
//        }
        return negativeInputs;
    }
}
