package test;

import library.JuniorStudent;
import library.Teacher;
import library.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void category() {
        Users user1 = new Teacher("esther", "teacher");
        Users user2 = new Teacher("ibrahim", "senior");

        assertEquals(true, user1.category());
        assertEquals(false, user2.category());
    }

    @Test
    void addUser() {
        Users user1 = new Teacher("chibueze", "teacher");

        assertEquals(true, user1.addUser());
        assertEquals(false, user1.addUser());
    }

    @Test
    void findUser() {
        Users user1 = new Teacher("esther", "teacher");
        user1.findUser(user1.getName(), user1.getUserType());

        assertEquals("esther", user1.getName());
    }

    @Test
    void getName() {
        Users user2 = new Teacher("ibrahim", "teacher");

        assertEquals("ibrahim", user2.getName());
    }

    @Test
    void getUserType() {
        Users user4 = new Teacher("chibueze", "teacher");

        assertEquals("teacher", user4.getUserType());
    }
}