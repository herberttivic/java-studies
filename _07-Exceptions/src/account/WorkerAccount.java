package account;

import user.UserAdmin;
import user.UserWorker;

public class WorkerAccount implements Account{
    private UserWorker user;

    public WorkerAccount(UserWorker user) {
        this.user = user;
    }

    @Override
    public void login() throws Exception{
        if(!this.user.GetIsActive()){
            throw new Exception("O usuário dessa conta não está ativo");
        }
        System.out.println(user.getName() + " is logged in!");
    }

    @Override
    public void logout() throws Exception{
        if(!this.user.GetIsActive()){
            throw new Exception("O usuário dessa conta não está ativo");
        }
        System.out.println(user.getName() + " is logged out!");
    }

    public UserWorker getUser() {
        return user;
    }
}
