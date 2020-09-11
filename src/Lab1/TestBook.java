package Lab1;

import java.util.Scanner;

public class TestBook {
    public static void main(String args[]) {
        System.out.print("Do you want to import data of book?(yes/no) ");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        if (check.equals("yes")) {
            Book newBook = new Book();
            enterInformation(newBook);
            newBook.returnInformation();
        } else {
            Book newBook = new Book("Kundun", "Dailai Datma", 15000, 500, true);
            newBook.returnInformation();
        }
        sc.close();
    }

    public static void enterInformation(Book book) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of book: ");
        book.setName(sc.nextLine());
        System.out.print("Name of author: ");
        book.setAuthor(sc.nextLine());
        System.out.print("Number of books: ");
        book.setNumberOfBooks(sc.nextInt());
        sc.nextLine();
        System.out.print("Cost: ");
        book.setCost(sc.nextInt());
        sc.nextLine();
        System.out.print("Available or not (true/false): ");
        book.setAvailable(sc.nextBoolean());
    }
}
