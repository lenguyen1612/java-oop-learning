package lesson07_2;

public class Book {

    private String ISBN;
    private String title;
    private String author;
    private String year;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Book(String ISBN, String title, String author, String year) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
    }

    public void printOut() {
        System.out.print("You added the book with info:" +
                "\nID: " + getISBN()
                + "\nTitle: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear of manufacture: " + getYear() + "\n");
    }
}
