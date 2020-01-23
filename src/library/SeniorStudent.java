package library;

public class SeniorStudent extends Users {

    public SeniorStudent(String name, String userType) {
        super(name, userType);
    }

    public boolean category() {
        return getUserType().equalsIgnoreCase("senior");
    }

    @Override
    public boolean addUser() {
        if (category()) return super.addUser();
        System.out.println("Warning: Invalid category!!!");
        return false;
    }

    @Override
    public String findUser(String userName, String userType) {
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
