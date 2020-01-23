package test;

import library.JuniorStudent;
import library.SeniorStudent;
import library.Teacher;
import library.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {

    @org.junit.jupiter.api.Test
    void addUser() {
        Users user1 = new JuniorStudent("ebi", "junior");

        assertEquals(true, user1.addUser());
        assertEquals(false, user1.addUser());
    }

    @org.junit.jupiter.api.Test
    void findUser() {
        Users user1 = new JuniorStudent("ebi", "junior");
        user1.findUser(user1.getName(), user1.getUserType());

        assertEquals("ebi", user1.getName());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Users user2 = new SeniorStudent("ebi", "junior");

        assertEquals("ebi", user2.getName());
    }

    @org.junit.jupiter.api.Test
    void getUserType() {
        Users user2 = new SeniorStudent("ebi", "senior");

        assertEquals("senior", user2.getUserType());
    }

    @Test
    void getUser(){
        Users user1 = new JuniorStudent("ebi", "junior");
        Users user2 = new Teacher("esther", "teacher");
        user1.addUser();
        user2.addUser();

        Object[] expectedOutput = {"ebi", "esther"};
        Object[] methodOutput = {user1.getName(), user2.getName()};

        assertArrayEquals(expectedOutput, methodOutput);
    }


}