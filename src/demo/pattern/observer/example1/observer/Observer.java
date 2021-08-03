package demo.pattern.observer.example1.observer;

public interface Observer
{
    String getName();
    void update( ObserverMessage observerMessage );
}
