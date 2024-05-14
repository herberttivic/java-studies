import operation.Div;
import strategy.OperationStrategy;

public class Main {
    public static void main(String[] args) {
       int a = 12;
       int b = 2;
       OperationStrategy strategy = new OperationStrategy(new Div());
       strategy.executeStrategy(a,b);

    }
}