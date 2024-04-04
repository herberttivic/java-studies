package account;

import user.UserAdmin;

public class AdminAccount implements AccountAdminPermissions{
    private UserAdmin user;

    public AdminAccount(UserAdmin user) {
        this.user = user;
    }

    @Override
    public void dashboard() throws Exception{
        if(!this.user.GetIsActive()){
            throw new Exception("O usuário dessa conta não está ativo");
        }
        System.out.println("no data to show");
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

    public UserAdmin getUser() {
        return user;
    }
}
