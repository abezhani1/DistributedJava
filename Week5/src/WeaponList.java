import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeaponList
{

    private List<Weapon> nameList = Arrays.asList
            (
            new Weapon("Straight Sword", 350, "Regular straight sword. For those " +
                                                                              "who have affinity of European blades."),
            new Weapon("Katana", 400, "Authentic Eastern steel."),
            new Weapon("Scimitar", 360, "classic curved blade. Shout out to all the " +
                                                                            "Drizzt fans!"),
            new Weapon("Battle Axe", 350, "Standard battle axe, For those who want " +
                                                                             "to be a viking war-lord."),
            new Weapon("Hand Axe", 200, "Light chopping axe. Carry it with you " +
                                                                            "on the go!"),
            new Weapon("War Axe", 360, "An axe with two edges, because one edge is " +
                                                                           "never enough."),
            new Weapon("Javelin", 200, "A throwing spear. When you're tired or " +
                                                                       "don't have time to let the enemy come to you."),
            new Weapon("Trident", 360, "A three pronged spear. Neptune and/or " +
                                                                          "Poseidon would be proud."),
            new Weapon("Long Spear", 350, "Standard long spear. Designed to keep " +
                                                                      "enemies at bay. Can be combined with a shield.")
            );

    public Weapon getWeapon(String weaponName)
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

    public List<Weapon> getAllWeapons(){
        return nameList;
    }

    public List<Weapon> findNames(String search) {
        search = search.toLowerCase();
        List<Name> theList = new ArrayList<>();
        for (Name name : nameList) {
            if (name.getFirst().toLowerCase().startsWith(search) ||
                    name.getLast().toLowerCase().startsWith(search)) {
                theList.add(name);
            }
        }
        return theList;
    }

}