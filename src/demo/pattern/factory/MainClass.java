package demo.pattern.factory;

import java.util.HashSet;
import java.util.Set;

import demo.pattern.factory.RoomHandlers.DeluxeRoomHandler;
import demo.pattern.factory.RoomHandlers.ExecutiveRoomHandler;
import demo.pattern.factory.RoomHandlers.ClassicRoomHandler;
import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class MainClass
{
    public static void main( String[] args )
    {
        DeluxeRoomHandler deluxeRoomHandler = new DeluxeRoomHandler();
        ClassicRoomHandler nonAcRoomHandler = new ClassicRoomHandler();
        ExecutiveRoomHandler executiveRoomHandler = new ExecutiveRoomHandler();

        Set<RoomHandler> roomHandlerSet = new HashSet<>();
        roomHandlerSet.add( deluxeRoomHandler );
        roomHandlerSet.add( nonAcRoomHandler );
        roomHandlerSet.add( executiveRoomHandler );

        //RoomBooking process
        RoomHandlerFactory roomHandlerFactory = new RoomHandlerFactory( roomHandlerSet );

        RoomHandler roomHandler = roomHandlerFactory.getRoomHandler( RoomType.DELUXE );
        RoomBookingResponse roomBookingResponse = roomHandler.bookRoom();
        System.out.println(roomBookingResponse);

        roomHandler = roomHandlerFactory.getRoomHandler( RoomType.CLASSIC );
        roomBookingResponse = roomHandler.bookRoom();
        System.out.println(roomBookingResponse);

        roomHandler = roomHandlerFactory.getRoomHandler( RoomType.EXECUTIVE );
        roomBookingResponse = roomHandler.bookRoom();
        System.out.println(roomBookingResponse);
    }
}
