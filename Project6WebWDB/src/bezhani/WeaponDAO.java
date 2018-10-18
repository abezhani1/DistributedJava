package bezhani;

import java.util.List;

public interface WeaponDAO {
    public List<Weapon> getItemCatalog();
    public List<Weapon> getFeaturedItemCatalog();
    public Weapon getSingleItem(String itemNum);
    public void addItem(Weapon weapon);
    public void closeDB();

}
