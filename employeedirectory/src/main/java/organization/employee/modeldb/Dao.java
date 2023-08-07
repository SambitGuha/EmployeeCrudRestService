package organization.employee.modeldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import organization.employee.model.Employee;

public class Dao {
    public Employee getemployeedetail(int id) {
    	try {
    	
		String url="jdbc:mysql://localhost:3306/org";
		String user_name="root";
		String password="sambit";
		String query="select * from emp where id=" + id ;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user_name,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		String name=rs.getString(2);
		String dept=rs.getString(3);
		int year=rs.getInt(4);
		st.close();
		con.close();
		Employee employee = new Employee(id,name,dept,year);
		return employee;
    	}
    	catch(Exception ex)
    	{
    		return null;
    	}
    }
}
