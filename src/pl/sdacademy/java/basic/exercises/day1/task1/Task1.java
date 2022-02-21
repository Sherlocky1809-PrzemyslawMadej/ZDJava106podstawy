package pl.sdacademy.java.basic.exercises.day1.task1;

public class Task1 {
    public static void main(String[] args) {

//    displayWordUsingDecimalFormat(); //Kod ASCII
//        displayWordUsingHexFormat();
        displayWordUsingBinaryFormat();

    }

    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingHexFormat() {
        // 53 44 41.
        char s = 0x53; //heksadecymalny zapis
        char d = 0x44; //heksadecymalny zapis
        char a = 0x41; //heksadecymalny zapis
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
    private static void displayWordUsingBinaryFormat() {
        // 0101 0011 - s
        // 0100 0100 - d
        // 0100 0001 - a
        char s = 0b01010011; //binarny zapis
        char d = 0b01000100; //binarny zapis
        char a = 0b01000001; //binarny zapis

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
