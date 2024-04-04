import user.User;
import user.UserAdmin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//      PARAMÉTRICO
        var db = new ArrayList<User>();

        db.add(new User("Herbert"));
        db.add(new User("Test"));
        db.add(new User());
        db.add(new UserAdmin("Gabriel"));
        db.add(new UserAdmin("Sapucaia"));
        db.forEach(user -> {
            user.print();
        });

    }
}