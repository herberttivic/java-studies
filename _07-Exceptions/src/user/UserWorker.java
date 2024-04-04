package user;

public class UserWorker extends User{

    public UserWorker(String name){
        super(name);
    }

    public UserWorker(){
        super();
    }

    public void print() {
        System.out.println("_____________________");
        System.out.println("WORKER");
        System.out.println("ID " + this.id);
        System.out.println("NOME " + this.name);
        System.out.println("_____________________");
    }
}
