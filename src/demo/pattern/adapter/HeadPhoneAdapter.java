package demo.pattern.adapter;

public class HeadPhoneAdapter
{
    private IPhoneHeadPhone iPhoneHeadPhone;

    public HeadPhoneAdapter( IPhoneHeadPhone iPhoneHeadPhone )
    {
        this.iPhoneHeadPhone = iPhoneHeadPhone;
    }

    public void hearSongs( Phone phone )
    {
        if( phone.getPhoneName().equals( "OnePlus 8t" ) )
        {
            this.iPhoneHeadPhone.hearSong();
        }
        else
        {
            iPhoneHeadPhone.hearSong();
        }
    }
}
