package demo.pattern.abstractFactory;

import java.util.HashSet;
import java.util.Set;

import demo.pattern.factory.RoomHandlers.BasicRoomHandler;
import demo.pattern.factory.RoomHandlers.ClassicRoomHandler;
import demo.pattern.factory.RoomHandlers.DeluxeRoomHandler;
import demo.pattern.factory.RoomHandlers.ExecutiveRoomHandler;
import demo.pattern.factory.RoomHandlers.RoomHandler;
import demo.pattern.factory.model.RoomBookingResponse;
import demo.pattern.factory.model.RoomType;

public class MainClass
{
    //Abstract factory pattern is used when you have multiple handlers with multiple handler type. The abstract factory is the factory of factory.
    //Abstract factory class provides a factory of class and handles can be picked on based on the type param
    public static void main( String[] args ) throws Exception
    {
        DeluxeRoomHandler deluxeRoomHandler = new DeluxeRoomHandler();
        ClassicRoomHandler classicRoomHandler = new ClassicRoomHandler();
        ExecutiveRoomHandler executiveRoomHandler = new ExecutiveRoomHandler();
        BasicRoomHandler basicRoomHandler = new BasicRoomHandler();

        Set<RoomHandler> roomHandlerWithAcSet = new HashSet<>();
        Set<RoomHandler> roomHandlerWithoutAcSet = new HashSet<>();

        roomHandlerWithoutAcSet.add( classicRoomHandler );
        roomHandlerWithoutAcSet.add( basicRoomHandler );

        roomHandlerWithAcSet.add( deluxeRoomHandler );
        roomHandlerWithAcSet.add( executiveRoomHandler );


        //RoomBooking process
        RoomWithAcRoomFactory roomWithAcRoomFactory = new RoomWithAcRoomFactory( roomHandlerWithAcSet );
        RoomWithoutAcRoomFactory roomWithoutAcRoomFactory = new RoomWithoutAcRoomFactory( roomHandlerWithoutAcSet );

        RoomFactoryBase roomFactoryBase = new RoomFactoryBase( roomWithAcRoomFactory, roomWithoutAcRoomFactory );

        AbstractRoomFactory abstractRoomFactory = roomFactoryBase.getRoomFactory(true );
        RoomHandler roomHandler = abstractRoomFactory.getRoomHandler( RoomType.EXECUTIVE );
        RoomBookingResponse roomBookingResponse = roomHandler.bookRoom();

        System.out.println( roomBookingResponse );

        abstractRoomFactory = roomFactoryBase.getRoomFactory(false );
        roomHandler = abstractRoomFactory.getRoomHandler( RoomType.CLASSIC );
        roomBookingResponse = roomHandler.bookRoom();

        System.out.println( roomBookingResponse );

        //Invalid scenario
        abstractRoomFactory = roomFactoryBase.getRoomFactory(false );
        roomHandler = abstractRoomFactory.getRoomHandler( RoomType.EXECUTIVE );
        roomBookingResponse = roomHandler.bookRoom();

        System.out.println( roomBookingResponse );

    }
}
