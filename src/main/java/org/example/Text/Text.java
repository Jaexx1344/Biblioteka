package org.example.Text;

import org.example.book.BookService;

import java.io.IOException;
import java.util.Scanner;

public class Text {

    private BookService bookService = new BookService();
    public void init() throws IOException {
        System.out.println("Siemka");
        this.bookService.readAll();

        System.out.println("Wybierz operację");
        Scanner sc = new Scanner(System.in);

        int option =-1;

        while(option!=0){
            System.out.println("1.Dodaj nową książkę : ");
            System.out.println("0.Wyjdź z systemu");

            option=Integer.parseInt(sc.nextLine());

            if(option==1) {
                this.handleCreateNewBook(sc);
            }
            else if (option==0){
                System.out.println("Zapisuje dane");
                this.bookService.saveAll();
                System.out.println("Koniec, papa");
            }
        }
    }

    private void handleCreateNewBook(Scanner sc) {
        System.out.println("Podaj tytuł książki");
        String title = sc.nextLine();
        this.bookService.createBook(title);
    }
}
