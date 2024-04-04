import user.User;
import user.UserAdmin;
import user.UserWorker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var db = new ArrayList<User>();

        db.add(new UserWorker("Herbert"));
        db.add(new UserWorker("Test"));
        db.add(new UserWorker());
        db.add(new UserAdmin("Gabriel"));
        db.add(new UserAdmin("Sapucaia"));
        db.forEach(user -> {
            user.print();
        });

    }
}