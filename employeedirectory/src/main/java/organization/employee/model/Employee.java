package organization.employee.model;
import java.util.*;
public class Employee {
	private String name;
	private int roll;
	private String department;
	private int year;
    public Employee()
    {
    	
    }
	public Employee(int roll,String name,String department,int year)
	{
		this.roll=roll;
		this.name=name;
		this.department=department;
		this.year=year;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
