package account;

import user.User;
import user.UserAdmin;

public class AdminAccount implements AccountAdminPermissions{
    private UserAdmin user;

    public AdminAccount(UserAdmin user) {
        this.user = user;
    }

    @Override
    public void dashboard(){
        System.out.println("no data to show");
    }

    @Override
    public void login() {
        System.out.println(user.getName() + " is logged in!");
    }

    @Override
    public void logout() {
        System.out.println(user.getName() + " is logged out!");
    }
}
