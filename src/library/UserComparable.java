package library;

import java.util.Comparator;

public class UserComparable implements Comparator<Users> {

    public int compare(Users user1, Users user2) {
        String userType1 = user1.getUserType();
        String userType2= user2.getUserType();

        if (userType1.compareToIgnoreCase(userType2) > 0){
            return -1;
        }else if (userType1.compareToIgnoreCase(userType2) < 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
