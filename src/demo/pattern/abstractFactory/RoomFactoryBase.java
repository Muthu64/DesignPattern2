package demo.pattern.abstractFactory;

import demo.pattern.factory.model.RoomType;

public class RoomFactoryBase
{
    private RoomWithAcRoomFactory roomWithAcRoomFactory;
    private RoomWithoutAcRoomFactory roomWithoutAcRoomFactory;

    public RoomFactoryBase( RoomWithAcRoomFactory roomWithAcRoomFactory, RoomWithoutAcRoomFactory roomWithoutAcRoomFactory )
    {
        this.roomWithAcRoomFactory = roomWithAcRoomFactory;
        this.roomWithoutAcRoomFactory = roomWithoutAcRoomFactory;
    }

    public AbstractRoomFactory getRoomFactory( boolean isAcRoom )
    {
        AbstractRoomFactory abstractRoomFactory = null;

        if( isAcRoom )
        {
            abstractRoomFactory = roomWithAcRoomFactory;
        }
        else
        {
            abstractRoomFactory = roomWithoutAcRoomFactory;
        }

        return abstractRoomFactory;
    }
}
