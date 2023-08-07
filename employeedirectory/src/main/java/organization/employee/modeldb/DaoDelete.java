package organization.employee.modeldb;

import java.sql.*;

import organization.employee.model.Employee;

public class DaoDelete{
	
	public void deleteeemployee(int id) {
	try {
    	
			String url="jdbc:mysql://localhost:3306/org";
			String user_name="root";
			String password="sambit";
			String query="delete from emp where id =" + id;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user_name,password);
			Statement st = con.createStatement();
			int count=st.executeUpdate(query);
			
			}
			catch(Exception ex)
			{
				
			}
	}
}
