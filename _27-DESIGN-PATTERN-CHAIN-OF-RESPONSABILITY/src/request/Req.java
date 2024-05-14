package request;

public class Req {
    private int number;
    private int factor;
    private String operation;

    public Req( int number, int factor, String operation) {
        this.number = number;
        this.factor = factor;
        this.operation = operation;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
