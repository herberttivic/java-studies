package operation;

public class Sum implements IOperation{
    @Override
    public void exec(int a, int b) {
        System.out.println("sum: "+ (a+b));
    }
}
