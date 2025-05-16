/* This is a libary system that accpets the information inputed by the user and runs different functionality's like 
creating a book, adding a book, deleting a book, updating a book, listing all books, searching for a book, and exiting the program.
And each of the books have informations like title, author, category, and date.
* */

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Libsystem_two {

    ArrayList<Book> books = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Libsystem_two app = new Libsystem_two();
        app.run();
    }

    public void run() {
        String action = "";

        while (!action.equalsIgnoreCase("exit")) {
            System.out.print("\nEnter action (add/list/update/delete/exit): ");
            action = input.nextLine().trim().toLowerCase();

            switch (action) {
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "update":
                    update();
                    break;
                case "delete":
                    delete();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }

        input.close();
    }

    public void add() {
        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("Author: ");
        String author = input.nextLine();
        System.out.print("Category: ");
        String category = input.nextLine();
        LocalDate date = LocalDate.now();

        Book newBook = new Book(title, author, category, date);
        books.add(newBook);

        System.out.println("Book added.");
    }

    public void list() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nBook List:");
        for (Book book : books) {
            book.displayInfo();
            System.out.println("-----");
        }
    }

    public void update() {
        System.out.print("Enter title to update: ");
        String title = input.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("New title: ");
                book.setTitle(input.nextLine());
                System.out.print("New author: ");
                book.setAuthor(input.nextLine());
                System.out.print("New category: ");
                book.setCategory(input.nextLine());
                book.setDate(LocalDate.now());
                System.out.println("Book updated.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void delete() {
        System.out.print("Enter title to delete: ");
        String title = input.nextLine();

        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Book deleted.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void exit() {
        System.out.println("Exiting program...");
    }
}


class Book {
    private String title;
    private String author;
    private String category;
    private LocalDate date;

    public Book(String title, String author, String category, LocalDate date) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Date: " + date);
    }

}