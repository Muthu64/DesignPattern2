package demo.pattern.abstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomType;

public class RoomWithAcRoomFactory extends AbstractRoomFactory
{
    private Map<RoomType, RoomHandler> roomTypeRoomHandlerMap;

    public RoomWithAcRoomFactory( Set<RoomHandler> roomHandlerSet )
    {
        this.roomTypeRoomHandlerMap = new HashMap<>();

        for( RoomHandler roomHandler: roomHandlerSet )
        {
            this.roomTypeRoomHandlerMap.put( roomHandler.getRoomType(), roomHandler );
        }
    }

    @Override
    RoomHandler getRoomHandler( RoomType roomType ) throws Exception
    {
        RoomHandler roomHandler = this.roomTypeRoomHandlerMap.get( roomType );

        if( roomHandler == null )
        {
            throw new Exception( "Room with requested type not available : "+ roomType.name() );
        }

        return roomHandler;
    }
}
