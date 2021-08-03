package demo.pattern.factory.RoomHandlers;

import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public interface RoomHandler
{
    RoomType getRoomType();
    RoomBookingResponse bookRoom();
}
