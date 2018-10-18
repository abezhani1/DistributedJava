package bezhani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class WeaponDB {

    public WeaponDB()
    {

        try
        {
            // Create a named constant for the URL.
            // NOTE: This value is specific for Java DB.
            final String DB_URL = "jdbc:derby:WeaponDB;create=true";

            // Create a connection to the database.
            Connection conn =
                    DriverManager.getConnection(DB_URL);

            // If the DB already exists, drop the tables.
            dropTables(conn);

            // Build the Weapon table.
            buildWeaponTable(conn);

            // Build the Customer table.
            buildCustomerTable(conn);

            // Close the connection.
            conn.close();
        } catch (Exception e)
        {
            System.out.println("Error Creating the Weapon Table");
            System.out.println(e.getMessage());
        }

    }

    public static void dropTables(Connection conn)
    {
        System.out.println("Checking for existing tables.");

        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            try
            {
                // Drop the Customer table.
                stmt.execute("DROP TABLE Customer");
                System.out.println("Customer table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }

            try
            {
                // Drop the Weapon table.
                stmt.execute("DROP TABLE Weapon");
                System.out.println("Weapon table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /**
     * The buildWeaponable method creates the
     * Coffee table and adds some rows to it.
     */
    public static void buildWeaponTable(Connection conn)
    {
        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            // Create the table.
            stmt.execute("CREATE TABLE Weapon (" +
                    "ProdNum CHAR(10) NOT NULL PRIMARY KEY, " +
                    "ProdName CHAR(25), " +
                    "Price DOUBLE " +
                    ")");

            // Insert rows # 1 - 9.
            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'01-001', " +
                    "'Straight Sword', " +
                    "350.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'01-002', " +
                    "'Katana', " +
                    "400.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'01-003', " +
                    "'Scimitar', " +
                    "360.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'02-001', " +
                    "'Battle Axe', " +
                    "350.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'02-002', " +
                    "'War Axe', " +
                    "360.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'02-003', " +
                    "'Hand Axe', " +
                    "200.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'03-001', " +
                    "'Javelin', " +
                    "200.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'03-002', " +
                    "'Trident', " +
                    "360.00 )");

            stmt.execute("INSERT INTO Weapon VALUES ( " +
                    "'03-003', " +
                    "'Long Spear', " +
                    "350.00 )");


            System.out.println("Weapon table created.");
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    /**
     * The buildCustomerTable method creates the
     * Customer table and adds some rows to it.
     */
    public static void buildCustomerTable(Connection conn)
    {
        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            // Create the table.
            stmt.execute("CREATE TABLE Customer" +
                    "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
                    "  Name CHAR(25)," +
                    "  Address CHAR(25)," +
                    "  City CHAR(12)," +
                    "  State CHAR(2)," +
                    "  Zip CHAR(5) )");

            // Add some rows to the new table.
            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('1001', 'Atlas Corp.', '1773 S. Main St.'," +
                    " 'Baton Rouge', 'LA', '74215')");

            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('1002', 'Best Defense Co.'," +
                    " '2760 Hickory Ave.'," +
                    " 'Canton', 'NJ', '12739')");

            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('1003', 'Average Joe Gym', 'N44W7897 Watertown Plaza'," +
                    " 'Nashotah', 'WI', '53210')");

            System.out.println("Customer table created.");
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
