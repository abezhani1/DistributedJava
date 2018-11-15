package bezhani;

import java.util.List;

public interface MasqueradeDAO
{
    public List<Masquerade> getEventCatalog();
    public List<Masquerade> getFeaturedEventCatalog();
    public Masquerade getSingleEvent(String eventNum);
    public void addItem(Masquerade masquerade);
    public void closeDB();
}
