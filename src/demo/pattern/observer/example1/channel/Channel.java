package demo.pattern.observer.example1.channel;

import java.util.ArrayList;
import java.util.List;

import demo.pattern.observer.example1.observer.Observer;
import demo.pattern.observer.example1.observer.ObserverMessage;

public class Channel implements Subject
{
    private String channelName;
    private List<Observer> observerList;

    public Channel( String channelName )
    {
        this.channelName = channelName;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void subscribe( Observer observer )
    {
        this.observerList.add( observer );
        System.out.println( observer.getName() + " subscribed to the " + channelName + " channel.");
    }

    @Override
    public void unSubscribe( Observer observer )
    {
        this.observerList.remove( observer );
        System.out.println( observer.getName() + " un subscribed to the " + channelName + " channel.");
    }

    @Override
    public void notifySubscribers( ObserverMessage observerMessage )
    {
        for( Observer observer : observerList )
        {
            observer.update( observerMessage );
        }
    }

    public void uploadVideo( String title, int lengthOfVideo )
    {
        ObserverMessage observerMessage = new ObserverMessage( title, lengthOfVideo );
        this.notifySubscribers( observerMessage );
    }

    public String getChannelName()
    {
        return channelName;
    }

    public List<Observer> getObserverList()
    {
        return observerList;
    }
}
