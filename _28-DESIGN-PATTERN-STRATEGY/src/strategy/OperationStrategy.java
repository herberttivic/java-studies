package strategy;

import operation.IOperation;

public class OperationStrategy {
    IOperation operation;

    public OperationStrategy(IOperation operation) {
        this.operation = operation;
    }

    public void executeStrategy(int a, int b){
        this.operation.exec(a,b);
    }
}
