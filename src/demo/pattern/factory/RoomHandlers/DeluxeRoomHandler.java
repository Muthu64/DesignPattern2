package demo.pattern.factory.RoomHandlers;

import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class DeluxeRoomHandler implements RoomHandler
{
    @Override
    public RoomType getRoomType()
    {
        return RoomType.DELUXE;
    }

    @Override
    public RoomBookingResponse bookRoom()
    {
        RoomBookingResponse roomBookingResponse = new RoomBookingResponse( 2, "Thangam", getRoomType() );

        return roomBookingResponse;
    }
}
