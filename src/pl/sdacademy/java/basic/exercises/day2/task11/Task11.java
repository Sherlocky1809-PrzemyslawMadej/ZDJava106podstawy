package pl.sdacademy.java.basic.exercises.day2.task11;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        if (input != null) {
            String sbAfterReverse = new StringBuilder(input).reverse().toString();
            return sbAfterReverse.equals(input);
        }
        return false;
    }
}
