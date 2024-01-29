import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// class AgeValidException extends Exception{
//     public AgeValidException(String s){
//         super();
//     }
// }
// public class Userexp {
//     public static void main(String[] args) {
//         try {
//             int age = 150;
//             if(age>=21){
//                 System.out.println("welcome");
//             }
//             else {
//                 throw new AgeValidException("your age is not valid for marrige");
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//             // TODO: handle exception
//         }
//     }
// }
public class Userexp{
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection("jdbc"mysql://localhost"3306/gla", "root", "user1234");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select auth , price from book where isbn = 1236")
        while(rs.next()){
            System.out.println(rs.getString("auth"));
            System.out.println(rs.getString("price"));
        }
    }
}
