package demo.pattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomType;

public class RoomHandlerFactory
{
    private Map<RoomType, RoomHandler> roomTypeRoomHandlerMap;

    public RoomHandlerFactory( Set<RoomHandler> roomHandlerSet )
    {
        roomTypeRoomHandlerMap = new HashMap<>();
        for( RoomHandler roomHandler: roomHandlerSet )
        {
            this.roomTypeRoomHandlerMap.put( roomHandler.getRoomType(), roomHandler );
        }
    }

    public RoomHandler getRoomHandler( RoomType roomType )
    {
        RoomHandler roomHandler = this.roomTypeRoomHandlerMap.get( roomType );

        return roomHandler;
    }
}
