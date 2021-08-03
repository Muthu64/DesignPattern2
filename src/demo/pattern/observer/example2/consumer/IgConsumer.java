package demo.pattern.observer.example2.consumer;

import demo.pattern.observer.example2.model.OrderMessage;

public class IgConsumer implements Consumer
{
    private static final String IG_CONSUMER_NAME = "ig";

    @Override
    public String getName()
    {
        return IG_CONSUMER_NAME;
    }

    @Override
    public void update( OrderMessage orderMessage )
    {
        System.out.println( "Received order message in IG. Order message : "+ orderMessage );
    }
}
