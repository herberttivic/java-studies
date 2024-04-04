package user;

public abstract class User {
    private static int lastId = 1;
    protected final int id;
    protected String name;
    protected boolean isActive;

    public User(String name){
        this.id = lastId;
        lastId++;
        this.name = name;
        this.isActive = true;
    }
    public User(){
        this.id = lastId;
        lastId++;
        this.isActive = true;
        this.name = "Empty Name";
    }

    public static void welcome(){
        System.out.println("Welcome to this system!");

    }
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public boolean GetIsActive() { return isActive;}
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

}
