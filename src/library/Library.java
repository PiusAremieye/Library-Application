package library;

import java.util.*;

public class Library<L extends Books>{
    private String libraryName;
    private QueueImplementation bookCollectors;
    private ArrayList<Books> bookCollectedDetail;
    private ArrayList<Users> userCollectedDetail;
    private PriorityQueue<Users> bookCollectorsBasedOnPriority;
    private HashMap<Users, Books> bookCollectedDetailBasedOnPriority;

    public Library(String libraryName) {
        super();
        this.libraryName = libraryName;
        this.bookCollectors = new QueueImplementation();
        this.bookCollectedDetail = new ArrayList<>();
        this.userCollectedDetail = new ArrayList<>();
        this.bookCollectorsBasedOnPriority = new PriorityQueue<Users>(new UserComparable());
        this.bookCollectedDetailBasedOnPriority = new HashMap<Users, Books>();
    }

    public boolean applyForBook(Users userName, Books bookName){
        for (String s : userName.getUser()) {
            if (s.equalsIgnoreCase(userName.getName())) {
                if (bookCollectors.enqueue(userName)) {
                    System.out.println(userName.getName() + " of category " + userName.getUserType() + " is in queue to collect book " + bookName.getBookName());
                    bookCollectedDetail.add(bookName);
                    userCollectedDetail.add(userName);
                    return true;
                }
                System.out.println(userName.getName() + " already exists in the queue");
                return false;
            }
        }
        System.out.println(userName.getName() + " is not an eligible user");
        return false;
    }

    public boolean applyForBookBasedOfPriority(Users userName, Books bookName){
        for (String s : userName.getUser()) {
            if (s.equalsIgnoreCase(userName.getName())){
                if (!bookCollectorsBasedOnPriority.contains(userName)) {
                    System.out.println(userName.getName() + " of category " + userName.getUserType() + " is in queue to collect book " + bookName.getBookName());
                    bookCollectorsBasedOnPriority.add(userName);
                    bookCollectedDetailBasedOnPriority.put(userName, bookName);
                    return true;
                }
                System.out.println(userName.getName() + " already exists in the queue");
                return false;
            }
        }
        System.out.println(userName.getName() + " is not an eligible user");
        return false;
    }

    public boolean bookApproved(){
        if(bookCollectors.dequeue()){
            newAmountOfCopies(bookCollectedDetail.get(0));
            bookCollectedDetail.remove(0);
            userCollectedDetail.remove(0);
            return true;
        }
        return false;
    }

    public boolean bookApprovedBasedOnPriority(){
        Users removed = this.bookCollectorsBasedOnPriority.poll();
        if (removed != null) {
            String name = removed.getName();
            if (bookCollectedDetailBasedOnPriority.containsKey(removed)) {
                Books book = bookCollectedDetailBasedOnPriority.get(removed);
                int originalNumberOfCopies = book.getBooks().get(book.getBookName());

                if (originalNumberOfCopies < 1){
                    System.out.println("Oops book " + book.getBookName() + " is taken, " + name + " please leave the queue and come back later.");
                    return false;
                }
                else {
                    int remainingCopies = originalNumberOfCopies - 1;
                    book.getBooks().replace(book.getBookName(), originalNumberOfCopies, remainingCopies);
                    System.out.println("A copy of " + book.getBookName() + " was collected by " + name + " at " + new Date());
                    System.out.println("Note : Remaining copy of the book " + book.getBookName() + " is " + remainingCopies);
                    return true;
                }
            }
        }
        System.out.println("Queue Empty!!!");
        return false;
    }

    public void newAmountOfCopies(Books amount){
        String bookName = bookCollectedDetail.get(0).getBookName();
        String userName = userCollectedDetail.get(0).getName();
        int originalNumberOfCopies = amount.getBooks().get(bookCollectedDetail.get(0).getBookName());

        if (originalNumberOfCopies < 1){
            System.out.println("Oops, the book " + bookName + " is taken, " + userName + " please leave the queue and come back later.");
        }
        else {
            int remainingCopies = originalNumberOfCopies - 1;
            amount.getBooks().replace(bookCollectedDetail.get(0).getBookName(), originalNumberOfCopies, remainingCopies);
            System.out.println("A copy of " + bookName + " was collected by " + userName + " at " + new Date());
            System.out.println("Note : Remaining copy of the book " + bookName + " is " + remainingCopies);
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public QueueImplementation getBookCollectors() {
        return bookCollectors;
    }

    public ArrayList<Books> getBookCollectedDetail() {
        return bookCollectedDetail;
    }

    public ArrayList<Users> getUserCollectedDetail() {
        return userCollectedDetail;
    }

    public PriorityQueue<Users> getBookCollectorsBasedOnPriority() {
        return bookCollectorsBasedOnPriority;
    }

    public HashMap<Users, Books> getBookCollectedDetailBasedOnPriority() {
        return bookCollectedDetailBasedOnPriority;
    }

}

