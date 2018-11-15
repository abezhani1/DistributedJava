package bezhani;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventList implements MasqueradeDAO
{

    Connection conClose;
    private List<Masquerade> eventCatalog = new ArrayList<>();

    public EventList() {
        MasqueradeEventList db = new MasqueradeEventList();

        Connection conn = null;
        try
        {
            final String DB_URL = "jdbc:derby:MasqueradeEventList;create=true";

            conn = DriverManager.getConnection(DB_URL);
            conClose = conn;
            System.out.println("Test");
        }

        catch (Exception e)
        {
            System.out.println("Error Opening the Masquerade Event Table");
            System.out.println(e.getMessage());
        }
    }

    public void closeDB() {
        try
        {
            conClose.close();
        }

        catch (Exception e)
        {
            System.out.println("Error Opening the Masquerade Event Table");
            System.out.println(e.getMessage());
        }
    }

    public List<Masquerade> getEventCatalog()
    {
        Statement stmt = null;
        List<Masquerade> theList = new ArrayList<Masquerade>();
        try
        {
            stmt = conClose.createStatement();
            String sql;
            sql = "SELECT EvntNum, EvntName, EvntTime FROM EventList";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next())
            {
                String id = rs.getString("EvntNum");
                String name = rs.getString("EvntName");
                String time = rs.getString("EvntTime");

                theList.add(new Masquerade(id, name, time));
            }

            rs.close();
            stmt.close();
            return theList;
        }

        catch (SQLException se)
        {
            se.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }

    public List<Masquerade> getFeaturedEventCatalog()
    {
        List<Masquerade> item = new ArrayList<>();

        for (Masquerade i : eventCatalog)
        {
            if (i.isFeatured())
            {
                item.add(i);
            }
        }

        return item;
    }


    public Masquerade getSingleEvent(String eventNum)
    {
        Masquerade item = null;
        Statement stmt = null;

        try
        {
            stmt = conClose.createStatement();
            String sql;
            sql = "SELECT EvntNum, EvntName, EvntTime FROM EventList " + "WHERE EVNTNUM = '" + eventNum + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next())
            {
                String id = rs.getString("EvntNum");
                String name = rs.getString("EvntName");
                String time = rs.getString("EvntTime");
                return new Masquerade(id, name, time);
            }

            rs.close();
            stmt.close();
            return null;

        }

        catch (SQLException se)
        {
            se.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    public void addItem(Masquerade masquerade)
    {
        Statement stmt = null;
        try
        {
            stmt = conClose.createStatement();
            String sql = "INSERT INTO EventList " +
                    "VALUES ('" + masquerade.getEventNumber() + "', '" + masquerade.getEventName() + "', " + masquerade.getEventTime() + ")";
            stmt.executeUpdate(sql);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}