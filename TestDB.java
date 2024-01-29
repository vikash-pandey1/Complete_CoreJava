import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB{
    public static void main(String[] args) {
        System.out.println("welcome in database  fist classes  ");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/vikash","root", "vikash123");
            Statement sc = conn.createStatement();
            ResultSet re = sc.executeQuery("select * from student");

            while (re.next()) {
                System.out.println(re.getString("sname") + "  "+ re.getString("sage"));
            }

            
        } catch (Exception e) 
        {
        }
    }
}