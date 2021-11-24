package lesson03;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringsCls {

    public static void main(String[] arg) {
        //Exercise 01
        calculatedMins();

        //Exercise 02
        limitEnter();

        //Exercise 03
        extractDigit();

        //Exercise 04
        verifyURL();
    }

    private static void verifyURL() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the URL: ");
        String str = scanner.nextLine();
        String domain = str.split(":")[1];
        String[] end = str.split("\\.");

        System.out.println("Your URL is using: " + str.split(":")[0] + ", domain: " + domain.substring(domain.indexOf(".") + 1, domain.lastIndexOf(".")) + ", and " + end[2]);
    }

    private static void extractDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the characters: ");
        String str = scanner.nextLine();
        String tmp = "";

        String[] listItems = str.split("");
        for (int i = 0; i < listItems.length; i++) {
            if (isNumeric(listItems[i])) {
                tmp += listItems[i].toString();
            }
        }
        System.out.println("The number extracted: " + tmp);
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void limitEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        String strPass = scanner.nextLine();

        int i = 0;
        do {
            System.out.println("Please enter again your password: ");
            strPass = scanner.nextLine();
            i++;
        } while (i < 2);
    }


    private static void calculatedMins() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the time: ");
        String strTime = scanner.nextLine();

        String[] getHour = strTime.split("hrs");
        String[] getMin = getHour[1].split("minutes");

        int numHours = parseInt(getHour[0].trim()) * 60;
        int numMins = parseInt(getMin[0].substring(getMin[0].length() - 3, getMin[0].length() - 1).trim());
        System.out.println("Total minutes: " + (numHours * 60 + numMins));


    }
}
