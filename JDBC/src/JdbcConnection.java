import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcConnection 
{


	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		Statement statement=conn.createStatement();
		String sql="select * from student";
		ResultSet rs=statement.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		conn.close();
		}
		catch(Exception e)
		{
			System.out.println("dfdgfdfvdfv");
			
		}
		
	}

}
