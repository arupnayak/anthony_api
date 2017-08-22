package com.anthony.jersey.todo.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.anthony.jersey.todo.dao.ServiceRequestDao;
import com.anthony.jersey.todo.model.ServiceRequest;

// Will map the resource to the URL todos
@Path("/serviceRequests")
public class ServiceRequestsResource {

    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    // Return the list of todos to the user in the browser
    @GET
    @Produces(MediaType.TEXT_XML)
    public Response getTodosBrowser() {
        List<ServiceRequest> serviceRequests = new ArrayList<ServiceRequest>();
        serviceRequests.addAll(ServiceRequestDao.instance.getModel().values());
        return Response
        	      .status(200)
        	      .entity(serviceRequests)
        	      .build();

    }

    // Return the list of todos for applications
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response getTodos() {
        List<ServiceRequest> serviceRequests = new ArrayList<ServiceRequest>();
        serviceRequests.addAll(ServiceRequestDao.instance.getModel().values());
        return Response
      	      .status(200)
      	      .entity(serviceRequests)
      	      .build();
    }

    // retuns the number of todos
    // Use http://localhost:8080/com.vogella.jersey.todo/rest/todos/count
    // to get the total number of records
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getCount() {
        int count = ServiceRequestDao.instance.getModel().size();
        //return String.valueOf(count);
        return Response
        	      .status(200)
        	      .entity(count)
        	      .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateTodo(ServiceRequest serviceRequest) throws IOException {
    	System.out.println("UPDATE|POST");
        String message=ServiceRequestDao.instance.updateServiceRequest(serviceRequest);
        //ServiceRequestDao.instance.getModel().values();
        //return message;
        JsonObject value = Json.createObjectBuilder()
        	     .add("message", message)
        	     .build();
        return Response
      	      .status(200)
      	      .entity(value)
      	      .build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTodo(ServiceRequest serviceRequest) throws IOException {
    	System.out.println("CREATE|PUT");
        String message=ServiceRequestDao.instance.newServiceRequest(serviceRequest);
        //ServiceRequestDao.instance.getModel().values();
        //return message;
        JsonObject value = Json.createObjectBuilder()
       	     .add("message", message)
       	     .build();
       return Response
     	      .status(200)
     	      .entity(value)
     	      .build();
    }

    // Defines that the next path parameter after todos is
    // treated as a parameter and passed to the TodoResources
    // Allows to type http://localhost:8080/anthony_api/rest/todos/1
    // 1 will be treaded as parameter todo and passed to ServiceRequestResource
    @Path("{serviceRequest}")
    public Response getTodo(@PathParam("serviceRequest") String id) {
        //return new ServiceRequestResource(uriInfo, request, id);
        return Response
       	      .status(200)
       	      .entity(new ServiceRequestResource(uriInfo, request, id))
       	      .build();
    }

}