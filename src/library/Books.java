package library;

import java.util.ArrayList;
import java.util.HashMap;

public class Books extends Users{
    private String bookName;
    private HashMap<String, Integer> books;

    public Books(String userName, String userType, String bookName) {
        super(userName, userType);
        this.bookName = bookName;
    }

    public Books(String bookName) {
        super();
        this.bookName = bookName;
        this.books = new HashMap<>();
    }

    public String getBookName() {
        return bookName;
    }

    public boolean addBook(int initialAmount){
        if (findBooks(this.getBookName()) != null){
            int originalAmount = this.books.get(this.bookName);
            this.books.replace(bookName, originalAmount, (originalAmount + initialAmount));
            System.out.println("Number of books added for " + this.getBookName() + " is " + initialAmount);
            return true;
        }
        this.books.put(this.getBookName(), initialAmount);
        System.out.println("Number of new books for " + this.getBookName() + " is " + initialAmount);
        return true;
    }

    public int numberOfBooks(){
        int amount = 0;
        if (findBooks(this.getBookName()) != null){
            amount = this.books.get(this.getBookName());
        }
        System.out.println("Total Number of books for " + this.getBookName() + " is " + amount);
        return amount;
    }

    public String findBooks(String bookName) {
        for (HashMap.Entry<String, Integer> items : books.entrySet()) {
            if (items.getKey().equals(bookName)) return bookName;
        }
        return null;
    }

    public HashMap<String, Integer> getBooks() {
        return books;
    }
}
