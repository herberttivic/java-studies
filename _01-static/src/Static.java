import user.User;

public class Static {
    public static void main(String[] args) {
        var user1 = new User("Herbert");
        var user2 = new User("João");
        var user3 = new User("Maria");

        User.welcome();
        user1.print();
        user2.print();
        user3.print();
    }
}