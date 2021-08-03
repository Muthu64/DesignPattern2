package demo.pattern.observer.example2.consumer;

import demo.pattern.observer.example2.model.OrderMessage;

public class KdsConsumer implements Consumer
{
    private static final String KDS_CONSUMER_NAME = "kds";

    @Override
    public String getName()
    {
        return KDS_CONSUMER_NAME;
    }

    @Override
    public void update( OrderMessage orderMessage )
    {
        System.out.println( "Received order message in KDS. Order message : "+ orderMessage );
    }
}
