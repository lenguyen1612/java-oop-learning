package lesson07_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    static List<Book> listBook = new ArrayList<Book>();

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        boolean isContinuing = true;
        int tryAgain = 0;

        while (isContinuing) {
            System.out.println("=========Book Management=============");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve Book");
            System.out.println("0. Exit !");

            userInput = scanner.nextInt();
            if (userInput == 1)
                AddBook();
            else if (userInput == 2)
                RetrieveBook();
            else if (userInput == 0) {
                isContinuing = false;
                System.out.println("You out!!!");
            } else {
                System.out.println("Your option is not available");
                tryAgain++;
                if (tryAgain == 3)
                    break;
            }
        }

    }

    private static void RetrieveBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book's ID needs to retrieve");
        String id = scanner.nextLine();
        for (Book aBook : listBook) {
            if (aBook.getISBN().equals(id)) {
                System.out.println("The " + id + " exists");
            } else {
                System.out.println("The " + id + " is not exist");
            }
        }

    }

    private static void AddBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's ID");
        String ISBN = scanner.nextLine();

        System.out.println("Please enter book's title");
        String title = scanner.nextLine();

        System.out.println("Please enter book's author");
        String author = scanner.nextLine();

        System.out.println("Please enter year of manufacture");
        String year = scanner.nextLine();

        Book aBook = new Book(ISBN, title, author, year);
        listBook.add(aBook);
        aBook.printOut();
    }
}
