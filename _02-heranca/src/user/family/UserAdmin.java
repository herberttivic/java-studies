package user.family;

public class UserAdmin extends User{
    private final String accessKey;
    public UserAdmin(String name){
        super(name);
        this.accessKey = "secret key";
    }

    public String getAccessKey() {
        return accessKey;
    }
}
