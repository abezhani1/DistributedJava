import java.sql.*;
import java.util.List;

public class Main {

    public static WeaponDAO cc;
    public static void main(String[] args) {

        WeaponDB db = new WeaponDB();
        cc = new WeaponList();
        outputDB();
        addContent();
        System.out.println("==========================");
        outputDB();
        Weapon w = cc.getSingleItem("01-001");
        System.out.println(w.getWeaponNumber() + " " + w.getWeaponName());
        cc.closeDB();
    }

    public static void addContent()
    {
            cc.addItem (new Weapon("01-004", "Chain Blade", 450.00, ""));


            cc.addItem (new Weapon("02-004", "Halberd", 480.00, ""));

            cc.addItem (new Weapon("03-004", "Glaive", 450.00, ""));

            System.out.println("Inserted records into the table...");

        }



    public static void outputDB()
    {
        List<Weapon> theList = cc.getItemCatalog();

        for(Weapon w: theList)
            {
                //Retrieve by column name
                String id  = w.getWeaponNumber();
                String name = w.getWeaponName();
                double price = w.getPrice();

                //Display values
                System.out.format("ID: %6s Name: %-16s  Price: $%6.2f \n" ,id.trim(), name.trim(), price);
            }


        }
}

