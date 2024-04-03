package account;

import user.UserWorker;

public class WorkerAccount implements Account{
    private UserWorker user;

    public WorkerAccount(UserWorker user) {
        this.user = user;
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
