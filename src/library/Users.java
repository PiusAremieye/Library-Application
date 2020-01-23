package library;

import java.util.ArrayList;

public abstract class Users {
    private String name;
    private String userType;
    private ArrayList<String> user;

    public Users(String name, String userType) {
        this.name = name;
        this.userType = userType;
        this.user = new ArrayList<>();
    }

    public Users() {}

    public boolean category() {
        return getUserType().equalsIgnoreCase(userType);
    }

    public boolean addUser(){
        if (findUser(this.getName(), this.getUserType()) == null){
            this.user.add(name);
            System.out.println(this.getName() + " added to this borrowers list as a " + this.getUserType() + ".");
            return true;
        }
        System.out.println("Warning: " + this.getName() + " exists in borrowers list as a " + this.getUserType() + ".");
        return false;
    }

    public String findUser(String userName, String userType){
        for (String checkBorrowers : user) {
            if (checkBorrowers.equalsIgnoreCase(userName) && getUserType().equalsIgnoreCase(userType)) {
                return checkBorrowers;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }

    public ArrayList<String> getUser() {
        return user;
    }

    public String toString(){
        return name;
    }
}


