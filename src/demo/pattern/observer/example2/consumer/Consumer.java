package demo.pattern.observer.example2.consumer;

import demo.pattern.observer.example2.model.OrderMessage;

public interface Consumer
{
    String getName();
    void update( OrderMessage orderMessage );
}
