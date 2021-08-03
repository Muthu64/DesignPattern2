package demo.pattern.observer.example1.observer;

public class Subscriber implements Observer
{
    private String name;

    public Subscriber( String name )
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void update( ObserverMessage observerMessage )
    {
        System.out.println( "Subscriber with name: "+ this.name + " received an update : Title : "+ observerMessage.getTitle() + ", video length : "+ observerMessage.getVideoLength() );
    }
}
