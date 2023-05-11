package org.example.book;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BookService {

    private Repository repository = new Repository();

    public Book createBook(String title){
       return this.repository.createNewBook(title);

    }
    public void readAll() throws FileNotFoundException {
        this.repository.readAll();
    }
    public void saveAll() throws IOException {
        this.repository.saveAll();
    }
}
