package operation;

public class Mult implements IOperation{
    @Override
    public void exec(int a, int b) {
        System.out.println("mult: "+ (a*b));
    }
}
