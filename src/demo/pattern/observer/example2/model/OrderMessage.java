package demo.pattern.observer.example2.model;

import java.time.LocalDateTime;

public class OrderMessage
{
    private String orderId;
    private String orderNumber;
    private LocalDateTime orderCreatedTime;

    public OrderMessage( String orderId, String orderNumber, LocalDateTime orderCreatedTime )
    {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderCreatedTime = orderCreatedTime;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getOrderNumber()
    {
        return orderNumber;
    }

    public LocalDateTime getOrderCreatedTime()
    {
        return orderCreatedTime;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer( "OrderMessage{" );
        sb.append( "orderId='" ).append( orderId ).append( '\'' );
        sb.append( ", orderNumber='" ).append( orderNumber ).append( '\'' );
        sb.append( ", orderCreatedTime=" ).append( orderCreatedTime );
        sb.append( '}' );
        return sb.toString();
    }
}
