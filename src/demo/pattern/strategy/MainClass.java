package demo.pattern.strategy;

public class MainClass
{
    public static void main( String[] args )
    {
        //Ability to change the Operation class behaviour at runtime by injecting Operation strategy type
        Operation additionOperation = new Operation( new AdditionStrategy() );
        Operation subtractionOperation = new Operation( new SubtractionStrategy() );

        additionOperation.process();
        subtractionOperation.process();
    }
}
