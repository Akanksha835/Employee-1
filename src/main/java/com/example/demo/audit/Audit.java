package com.example.demo.audit;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="audit")
public class Audit {
	
	@Id
	public String root_id;
	
	private String status_message;
	private String application_name;
	private String error_id;
	
	public Audit(String root_id, String status_message, String application_name, String error_id) {
		this.root_id = root_id;
		this.status_message = status_message;
		this.application_name = application_name;
		this.error_id = error_id;
	}

	public String getRoot_id() {
		return root_id;
	}

	public void setRoot_id(String root_id) {
		this.root_id = root_id;
	}

	public String getStatus_message() {
		return status_message;
	}

	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}

	public String getApplication_name() {
		return application_name;
	}

	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}

	public String getError_id() {
		return error_id;
	}

	public void setError_id(String error_id) {
		this.error_id = error_id;
	}


	
}
