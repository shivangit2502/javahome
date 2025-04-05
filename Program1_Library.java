package Experiment8;

public class Program1_Library {
    static class Book {
        String title, author, ISBN;

        Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("The Alchemist", "Paulo Coelho", "1234567890");
        b.displayDetails();
    }
}

