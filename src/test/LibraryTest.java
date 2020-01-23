package test;

import library.*;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void applyForBook() {
        Library<Books> library = new Library<>("Decagon Library");
        Books book1 = new Books("Sugar Girl");
        Users user1 = new JuniorStudent("ebi", "junior");
        Users user2 = new Teacher("esther", "teacher");
        user1.addUser();

        assertEquals(true, library.applyForBook(user1, book1));
        assertEquals(false, library.applyForBook(user2, book1));
    }

    @Test
    void applyForBookBasedOfPriority() {
        Library<Books> library = new Library<>("Decagon Library");
        Books book1 = new Books("Sugar Girl");
        Users user1 = new JuniorStudent("ebi", "junior");
        Users user2 = new Teacher("esther", "teacher");
        user1.addUser();

        assertEquals(true, library.applyForBookBasedOfPriority(user1, book1));
        assertEquals(false, library.applyForBookBasedOfPriority(user2, book1));
    }

    @Test
    void bookApproved() {
        Library<Books> library = new Library<>("Decagon Library");
        Books book1 = new Books("Sugar Girl");
        Users user1 = new JuniorStudent("ebi", "junior");;
        user1.addUser();
        book1.addBook(3);
        library.applyForBook(user1, book1);

        assertEquals(true, library.bookApproved());
        assertEquals(false, library.bookApproved());
    }

    @Test
    void bookApprovedBasedOnPriority() {
        Library<Books> library = new Library<>("Decagon Library");
        Books book1 = new Books("Sugar Girl");
        Users user1 = new JuniorStudent("ebi", "junior");
        Users user2 = new Teacher("esther", "teacher");
        user1.addUser();
        user2.addUser();
        book1.addBook(2);
        library.applyForBookBasedOfPriority(user1, book1);
        library.applyForBookBasedOfPriority(user2, book1);
//
        assertEquals(true, library.bookApprovedBasedOnPriority());
        assertEquals(true, library.bookApprovedBasedOnPriority());
        assertEquals(false, library.bookApprovedBasedOnPriority());
    }

    @Test
    void getLibraryName() {
        Library<Books> library = new Library<>("Decagon Library");

        assertEquals("Decagon Library", library.getLibraryName());
    }

}