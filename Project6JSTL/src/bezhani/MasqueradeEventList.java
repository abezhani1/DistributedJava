package bezhani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class MasqueradeEventList
{

    public MasqueradeEventList()
    {

        try
        {
            final String DB_URL = "jdbc:derby:MasqueradeEventList;create=true";

            Connection conn =
                    DriverManager.getConnection(DB_URL);

            dropTables(conn);

            buildEventList(conn);

            conn.close();
        }

        catch (Exception e)
        {
            System.out.println("Error Creating the Masquerade Event Table");
            System.out.println(e.getMessage());
        }

    }

    public static void dropTables(Connection conn)
    {
        System.out.println("Checking for existing tables.");

        try
        {
            Statement stmt = conn.createStatement();

            try
            {
                stmt.execute("DROP TABLE EventList");
                System.out.println("EventList table dropped.");
            }

            catch (SQLException ex)
            {
            }
        }

        catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void buildEventList(Connection conn)
    {
        try
        {
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE EventList (" +
                    "EvntNum CHAR(10) NOT NULL PRIMARY KEY, " +
                    "EvntName CHAR(25), " +
                    "EvntTime CHAR(10) " +
                    ")");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-001', " +
                    "'Seating', " +
                    "'5:00 PM' )");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-002', " +
                    "'Guest Speaker', " +
                    "'5:15 PM' )");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-003', " +
                    "'Dinner', " +
                    "'6:00 PM' )");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-004', " +
                    "'Dancing', " +
                    "'7:00 PM' )");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-005', " +
                    "'Mask Contest', " +
                    "'9:00 PM' )");

            stmt.execute("INSERT INTO EventList VALUES ( " +
                    "'01-006', " +
                    "'Dancing', " +
                    "'10:00 PM' )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'01-007', " +
                    "'Closing Ceremony', " +
                    "'11:00 PM' )");

            System.out.println("EventList table created.");
        }

        catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
