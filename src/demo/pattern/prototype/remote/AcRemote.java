package demo.pattern.prototype.remote;

public class AcRemote extends Remote
{
    @Override
    public void turnOn()
    {
        System.out.println( "Ac turned on" );
    }
}
