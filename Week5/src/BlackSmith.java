import java.util.*;


public class BlackSmith
{

    public List getWtypes(String weapon)
    {
        List wtypes = new ArrayList();

        if (weapon.equals("Swords"))
        {
            wtypes.add(new Weapon("Straight Sword",350,
                    "Regular straight sword. For those who have affinity of European blades."));
            wtypes.add(new Weapon("Katana", 400,
                    "Authentic Eastern steel."));
            wtypes.add(new Weapon("Scimitar", 360,
                    "Classic curved blade. Shout out to all the Drizzt fans!"));
        }
            else if (weapon.equals("Axes"))
            {
                wtypes.add(new Weapon("Battle Axe", 350,
                        "Standard battle axe, For those who want to be a viking war-lord."));
                wtypes.add(new Weapon("Hand Axe", 200,
                        "Light chopping axe. Carry it with you on the go!"));
                wtypes.add(new Weapon("War Axe", 360,
                        "An axe with two edges, because one edge is never enough."));
            }
                else
                {
                    wtypes.add(new Weapon("Javelin", 200,
                            "A throwing spear. When you're tired or don't have time to let the " +
                                             "enemy come to you."));
                    wtypes.add(new Weapon("Trident", 360,
                            "A three pronged spear. Neptune and/or Poseidon would be proud."));
                    wtypes.add(new Weapon("Long Spear", 350,
                            "Standard long spear. Designed to keep enemies at bay. Can be combined " +
                                             "with a shield."));
                }
        return wtypes;
    }
}