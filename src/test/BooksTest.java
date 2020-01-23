package test;

import library.Books;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @Test
    void getBookName() {
        Books book1 = new Books("Sugar Girl");

        assertEquals("Sugar Girl", book1.getBookName());
    }

    @Test
    void addBook() {
        Books book1 = new Books("Sugar Girl");

        assertEquals(true, book1.addBook(3));
    }

    @Test
    void numberOfBooks() {
        Books book1 = new Books("Sugar Girl");
        book1.addBook(2);
        book1.addBook(5);

        assertEquals(7, book1.numberOfBooks());
    }

    @Test
    void findBooks() {
        Books book1 = new Books("Sugar Girl");
        Books book2 = new Books("Harry Porter");
        book1.addBook(2);

        assertEquals("Sugar Girl", book1.findBooks("Sugar Girl"));
        assertEquals(null, book2.findBooks("Harry Porter"));
    }

    @Test
    void getBooks() {
        Books book1 = new Books("Sugar Girl");
        Books book2 = new Books("Harry Porter");

        Object[] expectedOutput = {"Sugar Girl", "Harry Porter"};
        Object[] methodOutput = {book1.getBookName(), book2.getBookName()};

        assertArrayEquals(expectedOutput, methodOutput);
    }

}