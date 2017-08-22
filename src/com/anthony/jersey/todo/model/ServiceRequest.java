package com.anthony.jersey.todo.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceRequest {
	@XmlElement  String  id;
	@XmlElement  String  summary;
	@XmlElement  String	subject	;
	@XmlElement  String	category_id	;
	@XmlElement  String	assigned_to_id	;
	@XmlElement  String	assigned_on	;
	@XmlElement  String	date_closed	;
	@XmlElement  String	description	;
	@XmlElement  String	status_id	;
	@XmlElement  String	status_code	;
	@XmlElement  String	severity_id	;
	@XmlElement  String	urgency_id	;
	@XmlElement  Date	created	;
	@XmlElement  String	created_by	;
	@XmlElement  Date	updated	;
	@XmlElement  String	updated_by	;
	@XmlElement  String	failure_type	;
	@XmlElement  String	wo_no	;
	@XmlElement  String	site_contact	;
	@XmlElement  String	site_phone	;
	@XmlElement  String	service_type	;
	@XmlElement  String	company	;
	@XmlElement  String	ebs_customer_id	;
	@XmlElement  String	findings	;
	@XmlElement  String	work_performed	;
	@XmlElement  String	store_temperature	;
	@XmlElement  String	store_relative_humidity	;
	@XmlElement  String	case_temperature	;
	@XmlElement  String	frame_reading_volts	;
	@XmlElement  String	frame_reading_amps	;
	@XmlElement  String	anthony_model_num	;
	@XmlElement  Date	date_mfg	;
	@XmlElement  Date	case_mfg	;
	@XmlElement  String	does_store_have	;
	@XmlElement  String	eqp_grounded	;
	@XmlElement  String	separate_circuits	;
	@XmlElement  String	fan_blowing_direct	;
	@XmlElement  String	gaskets_sealing	;
	@XmlElement  String	problem_reported_diff	;
	@XmlElement  String	glass_condensation	;
	@XmlElement  String	frame_condensation	;
	@XmlElement  String	door_rail_condensation	;
	@XmlElement  String	box_condensation	;
	@XmlElement  String	install_problems	;
	@XmlElement  String	manager_name	;
	@XmlElement  String	invoice_number	;
	@XmlElement  String	manager_signature	;
	@XmlElement  String	invoice_amount	;
	@XmlElement  Date	invoice_date	;
	@XmlElement  String	files	;
	@XmlElement  String	address	;
	@XmlElement  String	city	;
	@XmlElement  String	state	;
	@XmlElement  String	country	;
	@XmlElement  String	zip_code	;
	@XmlElement  String	first_name	;
	@XmlElement  String	last_name	;
	@XmlElement  String	anthony_acc	;
	@XmlElement  String	phone	;
	@XmlElement  String	email	;
	@XmlElement  String	additional_product_info	;
	@XmlElement  String	incident_number	;
	@XmlElement  String	customer_contact_id	;
	
	java.util.Date dt=new java.util.Date();
	Date currentTime=new Date(dt.getTime());
	
	public ServiceRequest (String id, String summary){
        this.id = id;
        this.summary = summary;
    }

    public ServiceRequest(String id, String summary, String subject, String category_id, String assigned_to_id,
			String assigned_on, String date_closed, String description, String status_id, String status_code,
			String severity_id, String urgency_id, Date created, String created_by, Date updated, String updated_by,
			String failure_type, String wo_no, String site_contact, String site_phone, String service_type,
			String company, String ebs_customer_id, String findings, String work_performed, String store_temperature,
			String store_relative_humidity, String case_temperature, String frame_reading_volts,
			String frame_reading_amps, String anthony_model_num, Date date_mfg, Date case_mfg, String does_store_have,
			String eqp_grounded, String separate_circuits, String fan_blowing_direct, String gaskets_sealing,
			String problem_reported_diff, String glass_condensation, String frame_condensation,
			String door_rail_condensation, String box_condensation, String install_problems, String manager_name,
			String invoice_number, String manager_signature, String invoice_amount, Date invoice_date, String files,
			String address, String city, String state, String country, String zip_code, String first_name,
			String last_name, String anthony_acc, String phone, String email, String additional_product_info,
			String incident_number, String customer_contact_id) {
		super();
		this.id = id;
		this.summary = summary;
		this.subject = subject;
		this.category_id = category_id;
		this.assigned_to_id = assigned_to_id;
		this.assigned_on = assigned_on;
		this.date_closed = date_closed;
		this.description = description;
		this.status_id = status_id;
		this.status_code = status_code;
		this.severity_id = severity_id;
		this.urgency_id = urgency_id;
		this.created = created;
		this.created_by = created_by;
		this.updated = updated;
		this.updated_by = updated_by;
		this.failure_type = failure_type;
		this.wo_no = wo_no;
		this.site_contact = site_contact;
		this.site_phone = site_phone;
		this.service_type = service_type;
		this.company = company;
		this.ebs_customer_id = ebs_customer_id;
		this.findings = findings;
		this.work_performed = work_performed;
		this.store_temperature = store_temperature;
		this.store_relative_humidity = store_relative_humidity;
		this.case_temperature = case_temperature;
		this.frame_reading_volts = frame_reading_volts;
		this.frame_reading_amps = frame_reading_amps;
		this.anthony_model_num = anthony_model_num;
		this.date_mfg = date_mfg;
		this.case_mfg = case_mfg;
		this.does_store_have = does_store_have;
		this.eqp_grounded = eqp_grounded;
		this.separate_circuits = separate_circuits;
		this.fan_blowing_direct = fan_blowing_direct;
		this.gaskets_sealing = gaskets_sealing;
		this.problem_reported_diff = problem_reported_diff;
		this.glass_condensation = glass_condensation;
		this.frame_condensation = frame_condensation;
		this.door_rail_condensation = door_rail_condensation;
		this.box_condensation = box_condensation;
		this.install_problems = install_problems;
		this.manager_name = manager_name;
		this.invoice_number = invoice_number;
		this.manager_signature = manager_signature;
		this.invoice_amount = invoice_amount;
		this.invoice_date = invoice_date;
		this.files = files;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip_code = zip_code;
		this.first_name = first_name;
		this.last_name = last_name;
		this.anthony_acc = anthony_acc;
		this.phone = phone;
		this.email = email;
		this.additional_product_info = additional_product_info;
		this.incident_number = incident_number;
		this.customer_contact_id = customer_contact_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getAssigned_to_id() {
		return assigned_to_id;
	}
	public void setAssigned_to_id(String assigned_to_id) {
		this.assigned_to_id = assigned_to_id;
	}
	public String getAssigned_on() {
		return assigned_on;
	}
	public void setAssigned_on(String assigned_on) {
		this.assigned_on = assigned_on;
	}
	public String getDate_closed() {
		return date_closed;
	}
	public void setDate_closed(String date_closed) {
		this.date_closed = date_closed;
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getSeverity_id() {
		return severity_id;
	}
	public void setSeverity_id(String severity_id) {
		this.severity_id = severity_id;
	}
	public String getUrgency_id() {
		return urgency_id;
	}
	public void setUrgency_id(String urgency_id) {
		this.urgency_id = urgency_id;
	}
	public Date getCreated() {
		if(created==null){
			return currentTime;
		}
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated() {
		if(updated==null){
			return currentTime;
		}
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getFailure_type() {
		return failure_type;
	}
	public void setFailure_type(String failure_type) {
		this.failure_type = failure_type;
	}
	public String getWo_no() {
		return wo_no;
	}
	public void setWo_no(String wo_no) {
		this.wo_no = wo_no;
	}
	public String getSite_contact() {
		return site_contact;
	}
	public void setSite_contact(String site_contact) {
		this.site_contact = site_contact;
	}
	public String getSite_phone() {
		return site_phone;
	}
	public void setSite_phone(String site_phone) {
		this.site_phone = site_phone;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEbs_customer_id() {
		return ebs_customer_id;
	}
	public void setEbs_customer_id(String ebs_customer_id) {
		this.ebs_customer_id = ebs_customer_id;
	}
	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}
	public String getWork_performed() {
		return work_performed;
	}
	public void setWork_performed(String work_performed) {
		this.work_performed = work_performed;
	}
	public String getStore_temperature() {
		return store_temperature;
	}
	public void setStore_temperature(String store_temperature) {
		this.store_temperature = store_temperature;
	}
	public String getStore_relative_humidity() {
		return store_relative_humidity;
	}
	public void setStore_relative_humidity(String store_relative_humidity) {
		this.store_relative_humidity = store_relative_humidity;
	}
	public String getCase_temperature() {
		return case_temperature;
	}
	public void setCase_temperature(String case_temperature) {
		this.case_temperature = case_temperature;
	}
	public String getFrame_reading_volts() {
		return frame_reading_volts;
	}
	public void setFrame_reading_volts(String frame_reading_volts) {
		this.frame_reading_volts = frame_reading_volts;
	}
	public String getFrame_reading_amps() {
		return frame_reading_amps;
	}
	public void setFrame_reading_amps(String frame_reading_amps) {
		this.frame_reading_amps = frame_reading_amps;
	}
	public String getAnthony_model_num() {
		return anthony_model_num;
	}
	public void setAnthony_model_num(String anthony_model_num) {
		this.anthony_model_num = anthony_model_num;
	}
	public Date getDate_mfg() {
		return date_mfg;
	}
	public void setDate_mfg(Date date_mfg) {
		this.date_mfg = date_mfg;
	}
	public Date getCase_mfg() {
		return case_mfg;
	}
	public void setCase_mfg(Date case_mfg) {
		this.case_mfg = case_mfg;
	}
	public String getDoes_store_have() {
		return does_store_have;
	}
	public void setDoes_store_have(String does_store_have) {
		this.does_store_have = does_store_have;
	}
	public String getEqp_grounded() {
		return eqp_grounded;
	}
	public void setEqp_grounded(String eqp_grounded) {
		this.eqp_grounded = eqp_grounded;
	}
	public String getSeparate_circuits() {
		return separate_circuits;
	}
	public void setSeparate_circuits(String separate_circuits) {
		this.separate_circuits = separate_circuits;
	}
	public String getFan_blowing_direct() {
		return fan_blowing_direct;
	}
	public void setFan_blowing_direct(String fan_blowing_direct) {
		this.fan_blowing_direct = fan_blowing_direct;
	}
	public String getGaskets_sealing() {
		return gaskets_sealing;
	}
	public void setGaskets_sealing(String gaskets_sealing) {
		this.gaskets_sealing = gaskets_sealing;
	}
	public String getProblem_reported_diff() {
		return problem_reported_diff;
	}
	public void setProblem_reported_diff(String problem_reported_diff) {
		this.problem_reported_diff = problem_reported_diff;
	}
	public String getGlass_condensation() {
		return glass_condensation;
	}
	public void setGlass_condensation(String glass_condensation) {
		this.glass_condensation = glass_condensation;
	}
	public String getFrame_condensation() {
		return frame_condensation;
	}
	public void setFrame_condensation(String frame_condensation) {
		this.frame_condensation = frame_condensation;
	}
	public String getDoor_rail_condensation() {
		return door_rail_condensation;
	}
	public void setDoor_rail_condensation(String door_rail_condensation) {
		this.door_rail_condensation = door_rail_condensation;
	}
	public String getBox_condensation() {
		return box_condensation;
	}
	public void setBox_condensation(String box_condensation) {
		this.box_condensation = box_condensation;
	}
	public String getInstall_problems() {
		return install_problems;
	}
	public void setInstall_problems(String install_problems) {
		this.install_problems = install_problems;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getManager_signature() {
		return manager_signature;
	}
	public void setManager_signature(String manager_signature) {
		this.manager_signature = manager_signature;
	}
	public String getInvoice_amount() {
		return invoice_amount;
	}
	public void setInvoice_amount(String invoice_amount) {
		this.invoice_amount = invoice_amount;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAnthony_acc() {
		return anthony_acc;
	}
	public void setAnthony_acc(String anthony_acc) {
		this.anthony_acc = anthony_acc;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdditional_product_info() {
		return additional_product_info;
	}
	public void setAdditional_product_info(String additional_product_info) {
		this.additional_product_info = additional_product_info;
	}
	public String getIncident_number() {
		return incident_number;
	}
	public void setIncident_number(String incident_number) {
		this.incident_number = incident_number;
	}
	public String getCustomer_contact_id() {
		return customer_contact_id;
	}
	public void setCustomer_contact_id(String customer_contact_id) {
		this.customer_contact_id = customer_contact_id;
	}
	public ServiceRequest(){

    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}