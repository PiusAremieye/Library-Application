package test;

import library.JuniorStudent;
import library.SeniorStudent;
import library.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuniorStudentTest {

    @Test
    void category() {
        Users user1 = new JuniorStudent("tom", "junior");
        Users user2 = new JuniorStudent("ere", "senior");

        assertEquals(true, user1.category());
        assertEquals(false, user2.category());
    }

    @Test
    void addUser() {
        Users user1 = new JuniorStudent("tom", "junior");

        assertEquals(true, user1.addUser());
        assertEquals(false, user1.addUser());
    }

    @Test
    void findUser() {
        Users user1 = new JuniorStudent("ebi", "junior");
        user1.findUser(user1.getName(), user1.getUserType());

        assertEquals("ebi", user1.getName());
    }

    @Test
    void getName() {
        Users user2 = new JuniorStudent("ebi", "junior");

        assertEquals("ebi", user2.getName());
    }

    @Test
    void getUserType() {
        Users user4 = new JuniorStudent("faith", "junior");

        assertEquals("junior", user4.getUserType());
    }
}