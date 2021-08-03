package demo.pattern.adapter;

public class OnePlus8t implements Phone, AndroidPhoneHeadPhone
{
    @Override
    public String getPhoneName()
    {
        return "OnePlus 8t";
    }

    @Override
    public void hearSong()
    {
        System.out.println( "Hearing songs with android headphone" );
    }
}
