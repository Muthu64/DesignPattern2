package demo.pattern.prototype.remote;

public class TVRemote extends Remote
{
    @Override
    public void turnOn()
    {
        System.out.println( "TV turned on" );
    }
}
