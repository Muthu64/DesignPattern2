package demo.pattern.observer.example2.Publisher;

import demo.pattern.observer.example2.model.OrderMessage;
import demo.pattern.observer.example2.consumer.Consumer;

public interface Publisher
{
    void subscribe( Consumer observer );
    void unSubscribe( Consumer observer );
    void notifyPublisher( OrderMessage orderMessage );
}
