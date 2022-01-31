import java.sql.*;

public class jdbc {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mt_db", "root", "roshan06");

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from movie_master");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));

            }
        }

        catch (Exception e1) {
            e1.printStackTrace();

        } finally {

            con.close();
            System.out.println("received the data");
        }
    }

}