import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyTest {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:MySQL://localhost/mytest";
		  String username = "mehmet";
		  String password = "password";

     Connection conn  = DriverManager.getConnection(url,username,password);
     System.out.println("connected");
     Statement st;
     ResultSet re;
	 st=conn.createStatement();
	 re=st.executeQuery("select * from student");
	 while(re.next()) {
		 System.out.print(re.getInt("studentNo")+"\t");
		 System.out.print(re.getString("firstName")+"\t");
		 System.out.print(re.getString("lastName")+"\t");
		 System.out.print(re.getString("schoolName")+"\t");
		 System.out.println(re.getInt("score")+"\t");
		
	 }
	  conn.close();
	}

}
