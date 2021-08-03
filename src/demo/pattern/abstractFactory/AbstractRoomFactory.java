package demo.pattern.abstractFactory;

import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomType;

public abstract class AbstractRoomFactory
{
    abstract RoomHandler getRoomHandler( RoomType roomType ) throws Exception;
}
