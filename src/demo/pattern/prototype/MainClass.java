package demo.pattern.prototype;

import demo.pattern.prototype.remote.Remote;
import demo.pattern.prototype.remote.RemoteType;

public class MainClass
{
    public static void main( String[] args )
    {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        prototypeFactory.fillMap();

        Remote remote = prototypeFactory.getRemote( RemoteType.TV );
        remote.turnOn();

        Remote remote2 = prototypeFactory.getRemote( RemoteType.TV );
        remote.turnOn();

        Remote remote3 = prototypeFactory.getRemote( RemoteType.AC );
        remote3.turnOn();

        System.out.println( System.identityHashCode( remote ) );
        System.out.println( System.identityHashCode( remote2 ) );
        System.out.println( System.identityHashCode( remote3 ) );
    }
}
