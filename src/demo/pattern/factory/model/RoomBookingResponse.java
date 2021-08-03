package demo.pattern.factory.model;

public class RoomBookingResponse
{
    private int roomNumber;
    private String roomName;
    private RoomType roomType;

    public RoomBookingResponse( int roomNumber, String roomName, RoomType roomType )
    {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomType = roomType;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public String getRoomName()
    {
        return roomName;
    }

    public RoomType getRoomType()
    {
        return roomType;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer( "RoomBookingResponse{" );
        sb.append( "roomNumber=" ).append( roomNumber );
        sb.append( ", roomName='" ).append( roomName ).append( '\'' );
        sb.append( ", roomType=" ).append( roomType );
        sb.append( '}' );
        return sb.toString();
    }
}
