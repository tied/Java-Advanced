package edup.ap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBConnection {
    private static JDBConnection uniqueInstance = null;
    private Connection conn = null;

    private JDBConnection() {
        System.out.println("Instantiated!");
    }

    public static synchronized JDBConnection getUniqueInstance() {
        if (uniqueInstance == null) uniqueInstance = new JDBConnection();
        return uniqueInstance;
    }

    public void openConnection(String database, String user, String pwd) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/" + database + "?serverTimezone=GMT";

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);

            System.out.println("Connection opened to " + database);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            System.out.println("Connection closed!");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void executeInsert(String sql) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> selectAll(String sql) {
        ResultSet rs = null;
        ArrayList<String> result = new ArrayList<>();

        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                result.add(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getInt(3));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
}

