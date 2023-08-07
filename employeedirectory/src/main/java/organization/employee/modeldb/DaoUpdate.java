package organization.employee.modeldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import organization.employee.model.Employee;

public class DaoUpdate {
	 public Employee updateemployee(int id,Employee employee) {
	    	try {
	    	
			String url="jdbc:mysql://localhost:3306/org";
			String user_name="root";
			String password="sambit";
			String query="UPDATE emp  set id=(?),name=(?),department=(?),year=(?) where id=" + id;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user_name,password);
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, employee.getRoll());
			st.setString(2, employee.getName());
			st.setString(3, employee.getDepartment());
			st.setInt(4, employee.getYear());
			int count=st.executeUpdate();
			
			return employee;
	    	}
	    	catch(Exception ex)
	    	{
	    		return null;
	    	}
	    }

}
