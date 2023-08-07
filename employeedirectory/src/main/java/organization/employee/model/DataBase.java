package organization.employee.model;

import java.util.HashMap;



public class DataBase {
	private static HashMap<Integer,Employee> EmployeeList= new HashMap<>();
	public static HashMap<Integer,Employee> getEmployees()
	{
		return EmployeeList;
	}
	
}
