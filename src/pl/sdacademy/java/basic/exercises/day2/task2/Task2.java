package pl.sdacademy.java.basic.exercises.day2.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isWordStartsWithPrefix(null, "pro"));
        System.out.println(isWordStartsWithPrefix("programowanie", "pro"));
        System.out.println(isWordStartsWithPrefix("", "pro"));

        System.out.println();

        System.out.println(isWordEndsWithSuffix("programowanie", "b"));
        System.out.println(isWordEndsWithSuffix("programowanie", "nie"));
    }

    private static boolean isWordStartsWithPrefix(String input, String prefix) {
        // logika ? akcja gdy true : akcja gdy false;
        return input != null ? input.startsWith(prefix) : false;
//        if (input != null) {
//            return input.startsWith(prefix);
//        }
//        return false;
    }
    private static boolean isWordEndsWithSuffix(String input, String suffix) {
        // logika ? akcja gdy true : akcja gdy false;
        return input != null ? input.endsWith(suffix) : false;
//        if (input != null) {
//            return input.startsWith(prefix);
//        }
//        return false;
    }
}
