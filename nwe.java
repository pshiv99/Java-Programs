import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class nwe {
    public static void main(String[] args){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
            Statement stmt = conn.createStatement();

            String sql = "SELECT * from students";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.printf("%-15s%-10s%-15s%-10d%-10s", rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
                System.out.print("\n");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}