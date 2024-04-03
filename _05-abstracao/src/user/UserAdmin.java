package user;

public class UserAdmin extends User{
    private final String accessKey;
    public UserAdmin(String name){
        super(name);
        this.accessKey = "secret key";
    }
    public UserAdmin(){
        super();
        this.accessKey = "secret key";
    }

//  INCLUSÃO - SOBRESCRITA
    public void print() {
        System.out.println("_____________________");
        System.out.println("ADMIN");
        System.out.println("ID " + this.id);
        System.out.println("NOME " + this.name);
        System.out.println("_____________________");
    }

    public String getAccessKey() {
        return accessKey;
    }
}
