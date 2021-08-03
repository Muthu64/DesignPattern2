package demo.pattern.builder;

import java.time.LocalDateTime;

public class OrderBuilder
{
    private String orderId;
    private String orderNumber;
    private LocalDateTime orderCreatedTime;

    public OrderBuilder()
    {
    }

    public OrderBuilder setOrderId( String orderId )
    {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder setOrderNumber( String orderNumber )
    {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderBuilder setOrderCreatedTime( LocalDateTime orderCreatedTime )
    {
        this.orderCreatedTime = orderCreatedTime;
        return this;
    }

    public Order build()
    {
        Order order = new Order( this.orderId, this.orderNumber, this.orderCreatedTime );

        return order;
    }
}
