package demo.pattern.factory.RoomHandlers;

import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class BasicRoomHandler implements RoomHandler
{
    @Override
    public RoomType getRoomType()
    {
        return RoomType.BASIC;
    }

    @Override
    public RoomBookingResponse bookRoom()
    {
        RoomBookingResponse roomBookingResponse = new RoomBookingResponse( 5, "Pallavan", getRoomType() );

        return roomBookingResponse;
    }
}
