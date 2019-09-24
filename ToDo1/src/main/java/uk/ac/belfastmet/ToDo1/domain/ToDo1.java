package uk.ac.belfastmet.ToDo1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity is JPA object(Java Persistent Annotations)
@Entity 
//task is the table name created in mySQL
@Table(name = "task")

public class ToDo1 

{
	//variables in the task table
	private long id;
	private String user;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
			
	
	//these will be the variables columns in the table on the website
	private String name;
	private String description;
	private String status;
	private String completiondate;
	private String priority;
	
	//constructors
	public ToDo1() 
	{
		super();
	}
		
	public ToDo1(String name, String description, String status, String completiondate, String priority) 
	{
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.completiondate = completiondate;
		this.priority = priority;
	}
	@Column(name = "name" )
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	@Column(name = "description" )
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Column(name = "user" )
	public String getUser() 
	{
		return user;
	}
	
	public void setUser(String user)
	{
		this.user = user;
	}
	
	@Column(name = "status" )
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	@Column(name = "completiondate" )
	public String getCompletiondate()
	{
		return completiondate;
	}
	
	public void setCompletiondate(String completiondate)
	{
		this.completiondate = completiondate;
	}
	
	@Column(name = "priority" )
	public String getPriority()
	{
		return priority;
	}
	
	public void setPriority(String priority)
	{
		this.priority = priority;
	}
	
	public String toString()
	{
		return name + "" + description;
	}
}

