package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {

    public static void main(String[] a) {
        int[] myIntArr = {1, 2, 3, 4, 5, 6};
        //Printing out stars
        printStart();
        //Finding indices
        findingIndices(myIntArr);
    }

    public static void printStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to print start: ");
        int numberToPrint = scanner.nextInt();

        for (int i = numberToPrint; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }

    public static void findingIndices(int[] aryNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the sum-up number: ");
        int sumUpNumber = scanner.nextInt();
        String output = "";
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < aryNumber.length; i++) {
            for (int j = i; j < aryNumber.length; j++) {
                if ((sumUpNumber - aryNumber[i] == aryNumber[j]) && !tmp.contains(i)) {
                    tmp.add(i);
                    tmp.add(j);
                    System.out.println(i + " pair " + j);
                }
            }
            if (!tmp.contains(i)) {
                System.out.println(i + " has no pair");
            }
        }

    }
}
