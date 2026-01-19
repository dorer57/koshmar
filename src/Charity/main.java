package Charity;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/charity_db";
        String user = "postgres";
        String password = "0000";

        Connection con = null;
        Statement stmt = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, user, password);

            ps = con.prepareStatement(
                    "INSERT INTO donor(name) VALUES (?)"
            );
            ps.setString(1, "Ivan Ivanych");
            ps.executeUpdate();
            ps.close();

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM donor");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name")
                );
            }
            rs.close();
            stmt.close();

            ps = con.prepareStatement(
                    "UPDATE donor SET name=? WHERE id=?"
            );
            ps.setString(1, "Ivan Updated");
            ps.setInt(2, 1);
            ps.executeUpdate();
            ps.close();

            ps = con.prepareStatement(
                    "DELETE FROM donor WHERE id=?"
            );
            ps.setInt(1, 2);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
