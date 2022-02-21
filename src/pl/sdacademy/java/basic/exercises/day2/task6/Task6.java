package pl.sdacademy.java.basic.exercises.day2.task6;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char character = 'z';

        System.out.println("Input: " + input);
        System.out.println("Searched Character: " + character);
        System.out.println("Result: " + whereIsCharacter(input, character));
    }

    private static int whereIsCharacter(String input, char character) {
        if (input != null && !input.isBlank()) {
            return input.indexOf(character);
        }
        return -1;
    }
}
