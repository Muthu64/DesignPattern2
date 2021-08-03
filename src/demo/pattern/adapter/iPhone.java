package demo.pattern.adapter;

public class iPhone implements Phone, IPhoneHeadPhone
{
    @Override
    public String getPhoneName()
    {
        return "IPhone";
    }

    @Override
    public void hearSong()
    {
        System.out.println( "Hearing songs with iphone headphone" );
    }
}
