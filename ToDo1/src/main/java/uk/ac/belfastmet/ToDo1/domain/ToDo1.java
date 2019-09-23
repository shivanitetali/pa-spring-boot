package uk.ac.belfastmet.ToDo1.domain;

public class ToDo1 
{
	private String name;
	private String description;
	private String status;
	private String completiondate;
	private String priority;
	
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


	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public String getCompletiondate()
	{
		return completiondate;
	}
	public void setCompletiondate(String completiondate)
	{
		this.completiondate = completiondate;
	}
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

