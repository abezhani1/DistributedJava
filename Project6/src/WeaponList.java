import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WeaponList implements WeaponDAO
{
    Connection conClose;
    private List<Weapon> weaponCatalog = new ArrayList<>();
    //private int nextWeaponNumber;

    public WeaponList()
    {
        Connection conn = null;
        try
        {
            // Create a named constant for the URL.
            // NOTE: This value is specific for Java DB.
            final String DB_URL = "jdbc:derby:WeaponDB;create=true";

            // Create a connection to the database.
            conn = DriverManager.getConnection(DB_URL);
            conClose = conn;
            System.out.println("Test");
         //   conn.close();
        }

        catch (Exception e)
        {
            System.out.println("Error Opening the Weapon Table");
            System.out.println(e.getMessage());
        }

    }
    public void closeDB()
        {
            try {
                conClose.close();
            }
            catch (Exception e)
            {
                System.out.println("Error Opening the Weapon Table");
                System.out.println(e.getMessage());
            }
    }

    public List<Weapon> getItemCatalog()
    {
        Statement stmt = null;
        List<Weapon> theList = new ArrayList<Weapon>();
        try
        {
            stmt = conClose.createStatement();
            String sql;
            sql = "SELECT ProdNum, ProdName, Price FROM Weapon";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next())
            {
                //Retrieve by column name
                String id  = rs.getString("ProdNum");
                String name = rs.getString("ProdName");
                double price = rs.getDouble("Price");

                theList.add(new Weapon(id, name, price, ""));
            }

            rs.close();
            stmt.close();
            return theList;
        }

        catch(SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
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


    public Weapon getSingleItem(String itemNum)
    {
        Weapon item=null;
        Statement stmt = null;

        try
        {
            stmt = conClose.createStatement();
            String sql;
            sql = "SELECT ProdNum, ProdName, Price FROM Weapon " + "WHERE PRODNUM = '" + itemNum + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next())
            {
                String id  = rs.getString("ProdNum");
                String name = rs.getString("ProdName");
                double price = rs.getDouble("Price");
                return new Weapon(id, name, price, "");
            }

            rs.close();
            stmt.close();
            return null;
        }

        catch(SQLException se)
        {
            se.printStackTrace();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }


    @Override
    public void addItem(Weapon weapon)
    {
        Statement stmt = null;
        try {
            stmt = conClose.createStatement();
            String sql = "INSERT INTO Weapon " +
                    "VALUES ('"+ weapon.getWeaponNumber()+"', '" + weapon.getWeaponName()+"', "+ weapon.getPrice()+")";
            stmt.executeUpdate(sql);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}