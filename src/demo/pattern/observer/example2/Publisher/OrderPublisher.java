package demo.pattern.observer.example2.Publisher;

import java.util.ArrayList;
import java.util.List;

import demo.pattern.observer.example2.model.OrderMessage;
import demo.pattern.observer.example2.consumer.Consumer;

public class OrderPublisher implements Publisher
{
    List<Consumer> observerList;

    public OrderPublisher()
    {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void subscribe( Consumer observer )
    {
        this.observerList.add( observer );
    }

    @Override
    public void unSubscribe( Consumer observer )
    {
        this.observerList.remove( observer );
    }

    @Override
    public void notifyPublisher(  OrderMessage orderMessage )
    {
        for( Consumer observerCandidate : observerList )
        {
            observerCandidate.update( orderMessage );
        }
    }
}
