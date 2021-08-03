package demo.pattern.observer.example1.channel;

import demo.pattern.observer.example1.observer.Observer;
import demo.pattern.observer.example1.observer.ObserverMessage;

public interface Subject
{
    void subscribe( Observer observer );
    void unSubscribe( Observer observer );
    void notifySubscribers( ObserverMessage observerMessage);
}
