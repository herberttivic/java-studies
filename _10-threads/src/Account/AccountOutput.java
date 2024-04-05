package Account;

public class AccountOutput extends Thread {

    private final Account account;
    private double value;

    public AccountOutput(Account account, double value) {
        this.account = account;
        this.value = value;
    }

    public void run() {
        try {
            this.account.output(this.value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
