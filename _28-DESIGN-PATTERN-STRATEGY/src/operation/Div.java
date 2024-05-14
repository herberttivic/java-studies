package operation;

public class Div implements IOperation{
    @Override
    public void exec(int a, int b) {
        System.out.println("Div: " + (a/b));
    }
}
