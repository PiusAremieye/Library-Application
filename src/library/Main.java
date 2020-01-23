package library;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Users users1 = new JuniorStudent("ebi", "junior");
        Users users4 = new JuniorStudent("daro", "junior");
        Users users2 = new SeniorStudent("tom", "senior");
        Users users3 = new Teacher("bond","teacher");
        Users users5 = new Teacher("bibi","teacher");
        Users users6 = new Teacher("ere","teacher");
        users2.addUser();
        users1.addUser();
        users3.addUser();
        users4.addUser();
        users2.addUser();
        users4.addUser();
        users5.addUser();
        users6.addUser();

////        System.out.println(decagonLibrary.getLibraryName());

        System.out.println("==========================================");
        Books harryPorter = new Books("Harry Porter");
        Books loveLies = new Books("Love Lies");
        Books actOfWar = new Books("Act Of War");
        harryPorter.addBook(2);
        harryPorter.addBook(3);
        loveLies.addBook(1);
        actOfWar.addBook(0);
        loveLies.numberOfBooks();
        harryPorter.numberOfBooks();

        System.out.println("=============================================");

        Library<Books> decagonLibrary = new Library<>("Decagon");

//        decagonLibrary.applyForBook(users1, harryPorter);
//        decagonLibrary.applyForBook(users2, harryPorter);
//        decagonLibrary.applyForBook(users3, loveLies);
//        decagonLibrary.applyForBook(users4, loveLies);
//        decagonLibrary.applyForBook(users5, actOfWar);
//        decagonLibrary.applyForBook(users1, actOfWar);

//        decagonLibrary.applyForBookBasedOfPriority(users6, actOfWar);
        decagonLibrary.applyForBookBasedOfPriority(users2, harryPorter);
        decagonLibrary.applyForBookBasedOfPriority(users3, harryPorter);
//        decagonLibrary.applyForBookBasedOfPriority(users1, harryPorter);
//        decagonLibrary.applyForBookBasedOfPriority(users4, actOfWar);
//        decagonLibrary.applyForBookBasedOfPriority(users5, harryPorter);
//        decagonLibrary.applyForBookBasedOfPriority(users5, harryPorter);
        System.out.println("===================================================");
        decagonLibrary.bookApprovedBasedOnPriority();
        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.applyForBookBasedOfPriority(users6, harryPorter);
//        decagonLibrary.applyForBookBasedOfPriority(users4, harryPorter);
//        decagonLibrary.applyForBookBasedOfPriority(users5, harryPorter);
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        actOfWar.addBook(3);
//        decagonLibrary.applyForBookBasedOfPriority(users1, actOfWar);
//        decagonLibrary.applyForBookBasedOfPriority(users2, actOfWar);
//        decagonLibrary.applyForBookBasedOfPriority(users3, actOfWar);
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();
//        decagonLibrary.bookApprovedBasedOnPriority();

//        decagonLibrary.bookApproved();
//        decagonLibrary.bookApproved();
//        decagonLibrary.bookApproved();
//        decagonLibrary.bookApproved();
//        decagonLibrary.bookApproved();
//        decagonLibrary.applyForBook(users6, loveLies);
//        decagonLibrary.bookApproved();
//        loveLies.addBook(1);
//        decagonLibrary.applyForBook(users6, loveLies);
//        loveLies.numberOfBooks();
//        decagonLibrary.bookApproved();
//        decagonLibrary.bookApproved();

    }
}
