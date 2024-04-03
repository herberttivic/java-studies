import user.family.User;
import user.family.UserAdmin;

public class Heranca {
    public static void main(String[] args) {
        var herbert = new User("Herbert");
        var gabriel = new UserAdmin("Gabriel");
        var sapucaia = new UserAdmin("Sapucaia");

        herbert.print();
        gabriel.print();
        sapucaia.print();
    }
}