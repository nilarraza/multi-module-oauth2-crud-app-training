package com.inovaitsys.multicrud.response.model;

import java.util.List;

import com.inovaitsys.multicrud.employee.model.Employee;


public class Response {
	
	private List<Employee> data;
	private Error error;
	
	public Response(List<Employee> data, Error error2) {
		super();
		this.data = data;
		this.error = error2;
	}

	public Response(List<Employee> data) {
		super();
		this.data = data;
	}
	
	

	public Response(Error error) {
		super();
		this.error = error;
	}

	public Response() {
		super();
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
	

	
}
