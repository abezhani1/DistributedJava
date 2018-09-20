public class Weapon
{
    private String weaponName;
    private double price;
    private String weaponDescription;

    public Weapon(String weaponName, double price, String weaponDescription)
    {
        this.weaponName = weaponName;
        this.price = price;
        this.weaponDescription = weaponDescription;
    }

    public String getWeaponName()
    {
        return weaponName;
    }

    public void setWeaponName(String weaponName)
    {
        this.weaponName = weaponName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice (double price)
    {
        this.price = price;
    }

    public String getWeaponDescription()
    {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription)
    {
        this.weaponDescription = weaponDescription;
    }

}
