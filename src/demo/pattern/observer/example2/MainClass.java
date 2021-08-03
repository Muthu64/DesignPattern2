package demo.pattern.observer.example2;

import java.time.LocalDateTime;
import java.util.UUID;

import demo.pattern.observer.example2.Publisher.OrderPublisher;
import demo.pattern.observer.example2.consumer.IgConsumer;
import demo.pattern.observer.example2.consumer.KdsConsumer;
import demo.pattern.observer.example2.model.OrderMessage;

public class MainClass
{
    public static void main( String[] args )
    {
        KdsConsumer kdsConsumer = new KdsConsumer();
        IgConsumer igConsumer = new IgConsumer();

        OrderPublisher orderPublisher = new OrderPublisher();

        orderPublisher.subscribe( kdsConsumer );
        orderPublisher.subscribe( igConsumer );

        OrderMessage orderMessage = new OrderMessage( UUID.randomUUID().toString(), "12345", LocalDateTime.now() );
        orderPublisher.notifyPublisher( orderMessage );
    }
}
