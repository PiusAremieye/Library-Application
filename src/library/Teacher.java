package library;

public class Teacher extends Users {

    public Teacher(String name, String userType) {
        super(name, userType);
    }

    public boolean category() {
        return getUserType().equalsIgnoreCase("teacher");
    }

    @Override
    public boolean addUser() {
        if (category()) return super.addUser();
        System.out.println("Warning: Invalid category!!!");
        return false;
    }

    @Override
    public String findUser(String name, String userType) {
        return super.findUser(this.getName(), getUserType());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getUserType() {
        return super.getUserType();
    }
}
