package organization.employee.controller;

import java.util.*;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import organization.employee.model.Employee;
import organization.employee.service.PostService;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {
	PostService employeeservice =new PostService();
    @GET
    public List<Employee> getIt() {
    	
        return employeeservice.getAllEmployees();
    }
    
    @GET
    @Path("/{number}")
    public Employee getstud(@PathParam("number")int id) {
    	return employeeservice.getEmployee(id);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee create(Employee employee)
    {
    	return employeeservice.addEmployee(employee);
    }
    
    
    @PUT
    @Path("/{number}")
    public Employee update(@PathParam("number")int id,Employee employee)
    {
    	return employeeservice.updateEmployee(id,employee);
    }
    
    
    @DELETE
    @Path("/{number}")
    public void deleteStudent(@PathParam("number")int id) {
    	employeeservice.deleteEmployee(id);
    }
    
	

}

