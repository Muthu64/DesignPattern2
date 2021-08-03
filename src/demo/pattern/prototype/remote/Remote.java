package demo.pattern.prototype.remote;

public abstract class Remote implements Cloneable
{
    public abstract void turnOn();

    public Remote createClone()
    {
        Remote remote = null;

        try
        {
            remote = ( Remote ) super.clone();
        }
        catch( CloneNotSupportedException e )
        {
            e.printStackTrace();
        }

        return remote;
    }
}
