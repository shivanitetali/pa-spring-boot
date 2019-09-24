package uk.ac.belfastmet.ToDo1.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdk.internal.org.jline.utils.ShutdownHooks.Task;
import uk.ac.belfastmet.ToDo1.domain.ToDo1;
import uk.ac.belfastmet.ToDo1.repository.TaskRepository;
 
@Service
public class ToDo1Service
{
	Logger logger = LoggerFactory.getLogger(ToDo1Service.class);
	@Autowired
	private TaskRepository taskRepository;
	
	private ArrayList<ToDo1> homeToDo1;
	private ArrayList<ToDo1> completedToDo1;
	
	/**
	 * 
	 * @return to-do list in home page
	 */
	public ArrayList<ToDo1> getHomeToDo1()
	{
		this.homeToDo1 = new ArrayList<ToDo1>();
		
		this.homeToDo1.add(new ToDo1( "Shivani","Cooking","Work in progress","Morning","High"));
		this.homeToDo1.add(new ToDo1( "Srini","Cleaning","Work in progress","Afternoon","Medium"));
		this.homeToDo1.add(new ToDo1( "Aarush","Sorting","Work in progress","Evening","Low"));
		this.homeToDo1.add(new ToDo1( "Aayush","Painting","Work in progress","Night","Low"));
		
		return this.homeToDo1;
	}
	
	/**
	 * 
	 * @return completed list in completed page
	 */
	public ArrayList<ToDo1> getCompletedToDo1()
	{
		this.completedToDo1 = new ArrayList<ToDo1>();
		
		this.completedToDo1.add(new ToDo1( "Shivani","Cooking","Completed","Morning","High"));
		this.completedToDo1.add(new ToDo1( "Srini","Cleaning","Completed","Afternoon","Medium"));
		this.completedToDo1.add(new ToDo1( "Aarush","Sorting","Completed","Evening","Low"));
		this.completedToDo1.add(new ToDo1( "Aayush","Painting","Completed","Night","Low"));
		
		return this.completedToDo1;
	}
	
	public void getNumberOfTask()
	{
		//Iterable<Task> task = taskRepository.findAll();
		//Iterator<Task> iterator = task.iterator();
		//while (iterator.)
		logger.info("# of tasks{}", taskRepository.count());		
	}
}
