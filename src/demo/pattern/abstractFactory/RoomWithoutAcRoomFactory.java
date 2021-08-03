package demo.pattern.abstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomType;

public class RoomWithoutAcRoomFactory extends AbstractRoomFactory
{
    private Map<RoomType, RoomHandler> roomTypeRoomHandlerMap;

    public RoomWithoutAcRoomFactory( Set<RoomHandler> roomHandlerSet )
    {
        roomTypeRoomHandlerMap = new HashMap<>();

        for( RoomHandler roomHandler: roomHandlerSet )
        {
            this.roomTypeRoomHandlerMap.put( roomHandler.getRoomType(), roomHandler );
        }
    }

    @Override
    RoomHandler getRoomHandler( RoomType roomType )
    {
        RoomHandler roomHandler = this.roomTypeRoomHandlerMap.get( roomType );

        return roomHandler;
    }
}
