package bezhani;


import java.util.List;

public class EventListWrapper
{
    private List list;

    public EventListWrapper(List list)
    {
        this.list = list;
    }

    public List getList()
    {
        return list;
    }

    public int getSize()
    {
        return list.size();
    }


}

