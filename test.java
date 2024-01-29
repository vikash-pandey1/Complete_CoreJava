import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class test {
    public static void main(String[] args) {
        Connection conn;
        Statement st;
        ResultSet rs;
        String url = "jdbc:mysql://localhost:3306/text";
        String user = "vikash";
        String pass = "vikash123";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            st = conn.createStatement();
            String q = "select * from product";
            rs = st.executeQuery(q);
            //System.out.println(rs.next());
            //rs.getString(0);
            while(rs.next())
            {
                System.out.println(rs.getString("id")+" ");
                System.out.println(rs.getString("sname")+" ");
                System.out.println(rs.getString("sage")+" ");
            }
        } catch (Exception e) {
        }
    }
}
