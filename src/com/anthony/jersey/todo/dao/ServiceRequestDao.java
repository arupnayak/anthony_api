package com.anthony.jersey.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.anthony.DbConnection;
import com.anthony.jersey.todo.model.ServiceRequest;

public enum ServiceRequestDao {
    instance;

    private Map<String, ServiceRequest> contentProvider = new HashMap<>();

    private ServiceRequestDao() {

    }
    
    public Map<String, ServiceRequest> getModel(){
    	try {
			System.out.println("getServiceRequests");
			Connection con=DbConnection.getConnection();
			String query = "select * from xx_service_requests";
			PreparedStatement stmt = con.prepareStatement(query);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				//java.util.Date dt=new java.util.Date();
				ServiceRequest sr = new ServiceRequest();
				sr.setId(rs.getString("ID"));
				sr.setSubject(rs.getString("SUBJECT"));
				sr.setCategory_id(rs.getString("CATEGORY_ID"));
				sr.setAssigned_to_id(rs.getString("assigned_to_id"));
				sr.setAssigned_on(rs.getString("assigned_on"));
				sr.setDate_closed(rs.getString("date_closed"));
				sr.setDescription(rs.getString("DESCRIPTION"));
				sr.setCreated(new java.util.Date(rs.getDate("CREATED").getTime()));
				sr.setCreated_by(rs.getString("CREATED_BY"));
				sr.setFailure_type(rs.getString("FAILURE_TYPE"));
				sr.setWo_no(rs.getString("WO_NO"));
				sr.setSite_contact(rs.getString("SITE_CONTACT"));
				sr.setSite_phone(rs.getString("SITE_PHONE"));
				sr.setService_type(rs.getString("SERVICE_TYPE"));
				sr.setCompany(rs.getString("company"));
				sr.setFindings(rs.getString("FINDINGS"));
				sr.setWork_performed(rs.getString("WORK_PERFORMED"));
				
				contentProvider.put(rs.getString("ID"),sr);
			}

			stmt.close();
			rs.close();
			//con.close();
		} catch (SQLException ex) {
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());

			}
		} catch (Exception ex) {
			System.out.println("Exception:" + ex.getMessage());
			StackTraceElement[] ste = ex.getStackTrace();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());

			}

		}
        return contentProvider;
    }
    
    public String newServiceRequest(ServiceRequest sr){
    	String message="";
    	try {
    		System.out.println("returned from db");
			Connection con=DbConnection.getConnection();
			
			PreparedStatement stmt=con.prepareStatement("select XX_SERVICE_REQUESTS_SEQ.NEXTVAL from dual");
			ResultSet rs=stmt.executeQuery();
			int seq=-1;
			while(rs.next()){
				seq = rs.getInt(1);
			}
			System.out.println("Sequence value: "+seq);
			
			String query = "insert into xx_service_requests \n"
							+"("
							+ "id"
							+ ",subject"
							+ ",description"
							+ ",created"
							+ ",created_by"
							+ ",failure_type"
							+ ",wo_no"
							+ ",site_contact"
							+ ",site_phone"
							+ ",service_type"
							+ ",company"
							+ ",findings"
							+ ",work_performed"
							+ ")\n"
							+"values\n"
							+"(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			System.out.println("query:"+query);
			 stmt = con.prepareStatement(query);
			System.out.println("getSubject:"+sr.getSubject());
			System.out.println("getDescription:"+sr.getDescription());
			stmt.setInt		(1, seq);
			stmt.setString	(2, sr.getSubject());
			stmt.setString	(3, sr.getDescription());
			stmt.setDate	(4, new java.sql.Date(sr.getCreated().getTime()));
			stmt.setString	(5, sr.getCreated_by());
			stmt.setString	(6, sr.getFailure_type());
			stmt.setString	(7, sr.getWo_no());
			stmt.setString	(8, sr.getSite_contact());
			stmt.setString	(9, sr.getSite_phone());
			stmt.setString	(10, sr.getService_type());
			stmt.setString	(11, sr.getCompany());
			stmt.setString	(12, sr.getFindings());
			stmt.setString	(13, sr.getWork_performed());
			
			stmt.execute();
			con.commit();
			stmt.close();
			rs.close();
			//con.close();
			message="Service request created. ID: "+seq;
		} catch (SQLException ex) {
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			message="Service request creation failed with error: "+ex.getMessage();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());
			}
		} catch (Exception ex) {
			System.out.println("Exception:" + ex.getMessage());
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			message="Data insertion fail: "+ex.getMessage();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());
			}

		}
    	return message;
    }
    
    public String updateServiceRequest(ServiceRequest sr){
    	String message="";
    	try {
    		System.out.println("returned from db");
			Connection con=DbConnection.getConnection();
			
			PreparedStatement stmt;
			String query = "update xx_service_requests "
							+ "set id=?"
							+ ",subject=?"
							+ ",description=?"
							+ ",updated=?"
							+ ",updated_by=?"
							+ ",failure_type=?"
							+ ",wo_no=?"
							+ ",site_contact=?"
							+ ",site_phone=?"
							+ ",service_type=?"
							+ ",company=?"
							+ ",findings=?"
							+ ",work_performed=? "
							+ "where id=?";
			
			System.out.println("query:"+query);
			stmt = con.prepareStatement(query);
			System.out.println("getId:"+sr.getId());
			System.out.println("getDescription:"+sr.getDescription());
			System.out.println("getDescription:"+sr.getDescription());
			stmt.setString	(1, sr.getId());
			stmt.setString	(2, sr.getSubject());
			stmt.setString	(3, sr.getDescription());
			stmt.setDate	(4, new java.sql.Date(sr.getUpdated().getTime()));
			stmt.setString	(5, sr.getUpdated_by());
			stmt.setString	(6, sr.getFailure_type());
			stmt.setString	(7, sr.getWo_no());
			stmt.setString	(8, sr.getSite_contact());
			stmt.setString	(9, sr.getSite_phone());
			stmt.setString	(10, sr.getService_type());
			stmt.setString	(11, sr.getCompany());
			stmt.setString	(12, sr.getFindings());
			stmt.setString	(13, sr.getWork_performed());
			stmt.setString	(14, sr.getId());
			
			stmt.execute();
			con.commit();
			stmt.close();
			//con.close();
			message="Service request updated. ID: "+sr.getId();
		} catch (SQLException ex) {
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			message="Service request update failed with error: "+ex.getMessage();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());
			}
		} catch (Exception ex) {
			System.out.println("Exception:" + ex.getMessage());
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			message="Data update fail: "+ex.getMessage();
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());
			}

		}
    	return message;
    }

}