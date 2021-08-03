package demo.pattern.builder;

import java.time.LocalDateTime;

public class Order
{
    private String orderId;
    private String orderNumber;
    private LocalDateTime orderCreatedTime;

    public Order( String orderId, String orderNumber, LocalDateTime orderCreatedTime )
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
