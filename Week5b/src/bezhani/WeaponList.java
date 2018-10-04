package bezhani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeaponList
{
    private List<Weapon> weaponCatalog = new ArrayList<>();
    private int nextWeaponNumber;

    public WeaponList()
    {
        nextWeaponNumber = 1;
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Straight Sword", 350, "Regular straight sword. For those who have affinity of European blades."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Katana", 400, "Authentic Eastern steel."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Scimitar", 360, "Classic curved blade. Shout out to all the Drizzt fans!"));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Battle Axe", 350, "Standard battle axe, For those who want to be a viking war-lord."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"War Axe", 360, "An axe with two edges, because one edge is never enough."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Hand Axe", 200, "Light chopping axe. Carry it with you on the go!"));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Javelin", 200, "A throwing spear. When you're tired or don't have time to let the enemy come to you."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Trident", 360, "A three pronged spear. Neptune and/or Poseidon would be proud."));
        weaponCatalog.add(new Weapon(nextWeaponNumber++,"Long Spear", 350, "Standard long spear. Designed to keep enemies at bay. Can be combined with a shield."));
    }

    public List<Weapon> getItemCatalog() {
        return weaponCatalog;
    }

    public List<Weapon> getFeaturedItemCatalog()
    {
        List<Weapon> item = new ArrayList<>();

        for (Weapon i : weaponCatalog)
        {
            if (i.isFeatured())
            {
                item.add(i);
            }
        }
        return item;
    }

    public Weapon getSingleItem(int itemNum)
    {
        Weapon item=null;

        for(Weapon i: weaponCatalog)
        {
            if (i.getWeaponNumber() == itemNum)
            {
                return i;
            }
        }
        return item;
    }






    /*private List<Weapon> nameList = Arrays.asList
            (
            new Weapon("Straight Sword", 350, "Regular straight sword. For those " +
                                                                              "who have affinity of European blades."),
            new Weapon("Katana", 400, "Authentic Eastern steel."),
            new Weapon("Scimitar", 360, "Classic curved blade. Shout out to all the Drizzt fans!"),
            new Weapon("Battle Axe", 350, "Standard battle axe, For those who want to be a viking war-lord."),
            new Weapon("Hand Axe", 200, "Light chopping axe. Carry it with you on the go!"),
            new Weapon("War Axe", 360, "An axe with two edges, because one edge is never enough."),
            new Weapon("Javelin", 200, "A throwing spear. When you're tired or don't have time to let the enemy come to you."),
            new Weapon("Trident", 360, "A three pronged spear. Neptune and/or Poseidon would be proud."),
            new Weapon("Long Spear", 350, "Standard long spear. Designed to keep enemies at bay. Can be combined with a shield.")
            );*/

    /*public Weapon getWeapon(String weaponName)
    {
        Weapon theWeapon = null;

        for (Weapon name : nameList)
        {
            if (name.getWeaponName().equals(weaponName))
            {
                theWeapon = name;
            }
        }

        return theWeapon;
    }

    public double getWeaponPrice(double weaponName)
    {
        Weapon theWeapon = null;

        double price = 0;

        for (Weapon name : nameList)
        {
            if (name.getWeaponName().equals(weaponName))
            {
                price = name.getPrice();
            }
        }

        return price;
    }


    public List<Weapon> getAllWeapons(){
        return nameList;
    }

    public List<Weapon> findNames(String search)
    {
        search = search.toLowerCase();
        List<Weapon> theList = new ArrayList<>();
        for (Weapon name : nameList)
        {
            if (name.getWeaponName().toLowerCase().startsWith(search) ||
                    name.getWeaponDescription().toLowerCase().startsWith(search))
            {
                theList.add(name);
            }
        }
        return theList;
    }
*/
}