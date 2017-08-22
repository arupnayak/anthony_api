package com.anthony.jersey.todo.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import com.anthony.jersey.todo.dao.ServiceRequestDao;
import com.anthony.jersey.todo.model.ServiceRequest;

public class ServiceRequestResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    String id;
    public ServiceRequestResource(UriInfo uriInfo, Request request, String id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.id = id;
    }

    //Application integration
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getTodo() {
        ServiceRequest serviceRequest = ServiceRequestDao.instance.getModel().get(id);
        if(serviceRequest==null)
            throw new RuntimeException("Get: ServiceRequest with " + id +  " not found");
        //return serviceRequest;
        return Response
        	      .status(200)
        	      .entity(serviceRequest)
        	      .build();
    }

    // for the browser
    @GET
    @Produces(MediaType.TEXT_XML)
    public Response getTodoHTML() {
        ServiceRequest serviceRequest = ServiceRequestDao.instance.getModel().get(id);
        if(serviceRequest==null)
            throw new RuntimeException("Get: ServiceRequest with " + id +  " not found");
        //return serviceRequest;
        return Response
      	      .status(200)
      	      .entity(serviceRequest)
      	      .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response putTodo(JAXBElement<ServiceRequest> serviceRequest) {
        ServiceRequest c = serviceRequest.getValue();
        return putAndGetResponse(c);
    }

    @DELETE
    public void deleteTodo() {
        ServiceRequest c = ServiceRequestDao.instance.getModel().remove(id);
        if(c==null)
            throw new RuntimeException("Delete: ServiceRequest with " + id +  " not found");
    }

    private Response putAndGetResponse(ServiceRequest serviceRequest) {
        Response res;
        if(ServiceRequestDao.instance.getModel().containsKey(serviceRequest.getId())) {
            res = Response.noContent().build();
        } else {
            res = Response.created(uriInfo.getAbsolutePath()).build();
        }
        ServiceRequestDao.instance.getModel().put(serviceRequest.getId(), serviceRequest);
        return res;
    }



}