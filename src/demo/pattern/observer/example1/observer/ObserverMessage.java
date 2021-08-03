package demo.pattern.observer.example1.observer;

public class ObserverMessage
{
    private String title;
    private int videoLength;

    public ObserverMessage( String title, int videoLength )
    {
        this.title = title;
        this.videoLength = videoLength;
    }

    public String getTitle()
    {
        return title;
    }

    public int getVideoLength()
    {
        return videoLength;
    }
}
