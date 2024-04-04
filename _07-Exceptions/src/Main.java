import account.AdminAccount;
import user.User;
import user.UserAdmin;
import user.UserWorker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var db = new ArrayList<User>();

        db.add(new UserWorker("Herbert"));
        db.add(new UserAdmin("Gabriel"));
        db.forEach(User::print);

        var account = new AdminAccount(new UserAdmin("Sapucaia"));
        account.getUser().setIsActive(false);
        try {
            account.login();
            account.dashboard();
            account.logout();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}