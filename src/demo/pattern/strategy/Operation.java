package demo.pattern.strategy;

public class Operation
{
    private OperationStrategy operationStrategy;

    public Operation( OperationStrategy operationStrategy )
    {
        this.operationStrategy = operationStrategy;
    }

    public void process()
    {
        this.operationStrategy.doOperation();
    }
}
