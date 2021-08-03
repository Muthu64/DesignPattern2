package demo.pattern.factory.model;

public enum RoomType
{
    DELUXE( true),
    CLASSIC( false ),
    BASIC( false ),
    EXECUTIVE ( true );

    private boolean isAcAvailable;

    RoomType( boolean isAcAvailable )
    {
        this.isAcAvailable = isAcAvailable;
    }

    public boolean isAcAvailable()
    {
        return this.isAcAvailable;
    }
}
