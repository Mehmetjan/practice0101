import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectPerson {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:MySQL://localhost/person";
		 String username="mehmet";
		 String password= "password";
		 
		 Connection conn = DriverManager.getConnection(url,username,password);
		 System.out.println("connected..........");
		 Statement st;
		 ResultSet re;
		 st=conn.createStatement();
		 re=st.executeQuery("select * from person");
		 
		 while(re.next()) {
			 System.out.print(re.getInt("it")+"\t");
			 System.out.print(re.getString("firstName")+"\t");
			 System.out.print(re.getString("lastName")+"\t");
			 System.out.print(re.getInt("age")+"\t");
			 System.out.println(re.getString("city")+"\t");
		 }
              
		  conn.close();

	}

}
