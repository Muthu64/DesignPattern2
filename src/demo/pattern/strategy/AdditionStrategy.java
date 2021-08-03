package demo.pattern.strategy;

public class AdditionStrategy implements OperationStrategy
{
    @Override
    public void doOperation()
    {
        System.out.println( "Addition operation executed" );
    }
}
