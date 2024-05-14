package operation;

public class Sub implements IOperation{
    @Override
    public void exec(int a, int b) {
        System.out.println("Sub: " + (a-b));
    }
}
