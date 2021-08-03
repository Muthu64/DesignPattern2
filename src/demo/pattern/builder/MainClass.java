package demo.pattern.builder;

import java.time.LocalDateTime;
import java.util.UUID;

public class MainClass
{
    //Builder pattern is used to build an object using builder class where it has lot of field members and its hard to instantiate
    public static void main( String[] args )
    {
        OrderBuilder orderBuilder = new OrderBuilder().setOrderId( UUID.randomUUID().toString() ).setOrderNumber( "12345" );
        Order order = orderBuilder.build();
        System.out.println(order);


        orderBuilder = new OrderBuilder().setOrderId( UUID.randomUUID().toString() );
        order = orderBuilder.build();
        System.out.println(order);


        orderBuilder = new OrderBuilder().setOrderId( UUID.randomUUID().toString() ).setOrderNumber( "12345" ).setOrderCreatedTime( LocalDateTime.now() );
        order = orderBuilder.build();
        System.out.println(order);
    }
}
