package Account;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PhysicAccount implements Account {

    private double balance;
    private final String id;

    public PhysicAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public synchronized void output(double num) throws Exception {
        if (this.balance < num) {
            throw new Exception("Unable to do this operation. Verify you balance!");
        }

        this.balance -= num;
        this.log();
    }

    @Override
    public synchronized void input(double num) throws Exception {
        if (this.balance == 0) {
            throw new Exception("Unable to do this operation. Deposit cannot be zero!");
        }

        this.balance += num;
        this.log();
    }

    public void log() {
        NumberFormat formatter = new DecimalFormat("#0,00");
        System.out.println("__________________________");
        System.out.println("BALANCE: R$ " + (this.balance));
    }
}
