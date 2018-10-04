package bezhani;

public class Weapon
{
    private int weaponNumber;
    private String weaponName;
    private double price;
    private String weaponDescription;
    private boolean featured;

    public Weapon(int weaponNumber, String weaponName, double price, String weaponDescription)
    {
        this.weaponNumber = weaponNumber;
        this.weaponName = weaponName;
        this.price = price;
        this.weaponDescription = weaponDescription;
        this.featured = featured;
    }

    public boolean isFeatured() {
        return featured;
    }

    public int getWeaponNumber() {
        return weaponNumber;
    }

    public String getWeaponName()
    {
        return weaponName;
    }

    /*public void setWeaponName(String weaponName)
    {
        this.weaponName = weaponName;
    }*/

    public double getPrice()
    {
        return price;
    }

    /*public void setPrice (double price)
    {
        this.price = price;
    }*/

    public String getWeaponDescription()
    {
        return weaponDescription;
    }

    /*public void setWeaponDescription(String weaponDescription)
    {
        this.weaponDescription = weaponDescription;
    }*/

}
