package com.TaskManager.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Task_Manager")
public class Tasks 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subject;
	private String body;
	private String status;
	
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tasks(Long id, String subject, String body, String status) {
		super();
		this.id = id;
		this.subject = subject;
		this.body = body;
		this.status = status;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", subject=" + subject + ", body=" + body + ", status=" + status + "]";
	}
	
}
