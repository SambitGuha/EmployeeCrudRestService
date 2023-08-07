package organization.employee.servicedb;

import organization.employee.model.Employee;
import organization.employee.modeldb.Dao;
import organization.employee.modeldb.DaoDelete;
import organization.employee.modeldb.DaoPost;
import organization.employee.modeldb.DaoUpdate;

public class PostServicedb {
	public Employee getdb(int id)
	{
	   Dao dao = new Dao();
	   return dao.getemployeedetail(id);
	}
	public Employee createdb(Employee employee)
	{
	   DaoPost dao = new DaoPost();
	   return dao.createemployee(employee);
	}
	public void deletedb(int id)
	{
		DaoDelete dao = new DaoDelete();
		dao.deleteeemployee(id);
	}
	public Employee updatedb(int id,Employee employee)
	{
		DaoUpdate dao = new DaoUpdate();
		return dao.updateemployee(id,employee);
	}
	
	
     
}
