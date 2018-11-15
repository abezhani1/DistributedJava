package bezhani;

public class Masquerade
{
    private String eventNumber;
    private String eventName;
    private String eventTime;
    private boolean featured;

    public Masquerade(String eventNumber, String eventName, String eventTime)
    {
        this.eventNumber = eventNumber;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.featured = featured;
    }

    public boolean isFeatured() {
        return featured;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public String getEventName()
    {
        return eventName;
    }

    public String getEventTime()
    {
        return eventTime;
    }


}
