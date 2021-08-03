package demo.pattern.observer.example1;

import demo.pattern.observer.example1.channel.Channel;
import demo.pattern.observer.example1.observer.Subscriber;

public class MainClass
{
    public static void main( String[] args )
    {
        Channel pubgChannel = new Channel( "PUBG" );

        Subscriber muthuSubscriber = new Subscriber( "Muthu" );
        Subscriber kumarSubscriber = new Subscriber( "Kumar" );
        Subscriber saranSubscriber = new Subscriber( "Saran" );

        pubgChannel.subscribe( muthuSubscriber );
        pubgChannel.subscribe( saranSubscriber );
        pubgChannel.subscribe( kumarSubscriber );

        pubgChannel.uploadVideo( "How to do jiggle movement", 5 );

        pubgChannel.unSubscribe( saranSubscriber );

        pubgChannel.uploadVideo( "How to get 10+ kills in TDM", 3 );
    }
}
