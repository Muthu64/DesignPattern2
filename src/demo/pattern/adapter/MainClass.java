package demo.pattern.adapter;

public class MainClass
{
    public static void main( String[] args )
    {
        HeadPhoneAdapter headPhoneAdapter = new HeadPhoneAdapter( new iPhone() );
        OnePlus8t onePlus8t = new OnePlus8t();
        headPhoneAdapter.hearSongs( onePlus8t );
    }
}
