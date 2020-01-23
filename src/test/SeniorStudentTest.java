package test;

import library.SeniorStudent;
import library.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeniorStudentTest {

    @Test
    void category() {
        Users user1 = new SeniorStudent("tom", "senior");
        Users user2 = new SeniorStudent("ere", "junior");

        assertEquals(true, user1.category());
        assertEquals(false, user2.category());
    }

    @Test
    void addUser() {
        Users user1 = new SeniorStudent("tom", "senior");

        assertEquals(true, user1.addUser());
        assertEquals(false, user1.addUser());
    }

    @Test
    void findUser() {
        Users user1 = new SeniorStudent("ebi", "senior");
        user1.findUser(user1.getName(), user1.getUserType());

        assertEquals("ebi", user1.getName());
    }

    @Test
    void getName() {
        Users user2 = new SeniorStudent("ebi", "senior");

        assertEquals("ebi", user2.getName());
    }

    @Test
    void getUserType() {
        Users user4 = new SeniorStudent("faith", "senior");

        assertEquals("senior", user4.getUserType());
    }
}