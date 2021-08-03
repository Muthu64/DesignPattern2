package demo.pattern.factory.RoomHandlers;

import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class ClassicRoomHandler implements RoomHandler
{
    @Override
    public RoomType getRoomType()
    {
        return RoomType.CLASSIC;
    }

    @Override
    public RoomBookingResponse bookRoom()
    {
        RoomBookingResponse roomBookingResponse = new RoomBookingResponse( 1, "Malligai", getRoomType() );

        return roomBookingResponse;
    }
}
