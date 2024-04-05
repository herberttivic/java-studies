import Account.AccountInput;
import Account.AccountOutput;
import Account.PhysicAccount;

public class Main {
    public static void main(String[] args) throws Exception {
//        MyThread t1 = new MyThread();
//
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t1);
//
//        thread1.start();
//        thread2.start();


        try {
            var c1 = new PhysicAccount("123-4", 100);
            var in = new AccountInput(c1, 1000);
            var out1 = new AccountOutput(c1, 200);
            var out2 = new AccountOutput(c1, 300);
            in.start();

//            TO TEST WITH AND WITHOUT THE SYNCHRONIZE ON INPUT AND OUTPUT FUNCTION AT PHYSIC ACCOUNT CLASS
            out2.start();
            out1.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}