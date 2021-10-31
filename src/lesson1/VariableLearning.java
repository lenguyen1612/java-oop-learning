package lesson1;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableLearning {
    public static void main(String[] arg) {
        //Count how many even and odd number in an integer array
        int[] intArg = {0, 3, 4, 5, 6, 2, 5, 78, 9, 6};
        countEvenOddNumber(intArg);

        //Max number in an arg
        maxInArg(intArg);

        //Average an array
        avarageArg(intArg);

        //Acending an array
        ascendingOrder(intArg);

        //Factorial
        numberFactorial(2);
    }

    private static void countEvenOddNumber(int[] arg) {
        int even = 0, odd = 0;
        for (int i : arg) {
            if (i % 2 == 0 || i == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("The even is %s and the odd is %s", even, odd);
    }

    private static void maxInArg(int[] arg) {
        int max = 0;
        for (int i : arg) {
            if (max < i) {
                max = i;
            }
        }
        System.out.printf("\nMax numnber in an array: %s", max);
    }

    private static void avarageArg(int[] arg) {
        int sum = 0;
        for (int i : arg) {
            sum += i;
        }
        System.out.printf("\nAverage an array: %s", (sum / arg.length));
    }

    private static void ascendingOrder(int[] arg) {
        int min = 0, position = 0, current = 0;
        for (int i = 0; i < arg.length; i++) {
            min = arg[i];
            current = arg[i];
            for (int j = i; j < arg.length; j++) {
                if (min >= arg[j]) {
                    min = arg[j];
                    position = j;
                }
            }
            arg[position] = current;
            arg[i] = min;
        }
        System.out.printf("\nAscending an array: %s", Arrays.toString(arg));
    }

    private static void numberFactorial(int number) {
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        System.out.printf("\nFactorial: %s", total);
    }
}