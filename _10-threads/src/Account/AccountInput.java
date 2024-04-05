package Account;

public class AccountInput extends Thread {

    private final Account account;
    private double value;

    public AccountInput(Account account, double value) {
        this.account = account;
        this.value = value;
    }

    public void run() {
        try {
            this.account.input(this.value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
