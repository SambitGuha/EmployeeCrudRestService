package organization.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import organization.employee.model.DataBase;
import organization.employee.model.Employee;



public class PostService {
	private HashMap<Integer,Employee> employees= DataBase.getEmployees();
	public List<Employee>  getAllEmployees(){
		return new ArrayList<Employee>(employees.values());
	}
	public Employee addEmployee(Employee employee)
	{
		int id=employees.size()+1;
		employees.put(id, employee);
		return employee;
		
	}
	public Employee getEmployee(int roll)
	{
		return employees.get(roll);
	}
	public Employee updateEmployee(int id,Employee employee)
	{
		if(employee.getRoll()<=0)
		{
			return null;
		}
		employees.put(id,employee);
		return employee;
	}
	public void deleteEmployee(int id)
	{
		employees.remove(id);
	}
	

}
