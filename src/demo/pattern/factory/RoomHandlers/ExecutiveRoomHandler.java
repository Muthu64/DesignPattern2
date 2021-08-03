package demo.pattern.factory.RoomHandlers;

import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class ExecutiveRoomHandler implements RoomHandler
{
    @Override
    public RoomType getRoomType()
    {
        return RoomType.EXECUTIVE;
    }

    @Override
    public RoomBookingResponse bookRoom()
    {
        RoomBookingResponse roomBookingResponse = new RoomBookingResponse( 3, "Roja", getRoomType() );

        return roomBookingResponse;
    }
}
