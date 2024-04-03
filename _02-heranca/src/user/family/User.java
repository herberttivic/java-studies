package user.family;

public class User {
    private static int lastId = 1;
    private final int id;
    private String name;


    public User(String name){
        this.id = lastId;
        lastId++;
        this.name = name;
    }

    public static void welcome(){
        System.out.println("Welcome to this system!");

    }

    public void print(){

        System.out.println("_____________________");
        System.out.println("ID " + this.id);
        System.out.println("NOME " + this.name);
        System.out.println("_____________________");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
}
