package organization.employee.controllerdb;

import java.util.List;

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
import organization.employee.servicedb.PostServicedb;


@Path("/employeedb")
public class UserControllerDb {

	PostServicedb query= new PostServicedb();
	@GET
	@Path("/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getIt(@PathParam("number")int id) {
	
	    return query.getdb(id);
	}
	 
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee postIt(Employee employee) {
	
	    return query.createdb(employee);
	}
	
    @DELETE
    @Path("/{number}")
    public void deleteIt(@PathParam("number")int id) {
    	query.deletedb(id);
    }
    
    @PUT
    @Path("/{number}")
    public Employee update(@PathParam("number")int id,Employee employee)
    {
    	return query.updatedb(id,employee);
    }
    


}
