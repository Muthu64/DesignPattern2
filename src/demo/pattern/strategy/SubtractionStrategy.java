package demo.pattern.strategy;

public class SubtractionStrategy implements OperationStrategy
{
    @Override
    public void doOperation()
    {
        System.out.println( "Subtraction strategy executed" );
    }
}
