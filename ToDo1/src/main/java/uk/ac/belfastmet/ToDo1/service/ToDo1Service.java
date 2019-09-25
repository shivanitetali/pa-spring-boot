package uk.ac.belfastmet.ToDo1.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.ToDo1.domain.ToDo1;
import uk.ac.belfastmet.ToDo1.repository.TaskRepository;
 
/**
 * Class holding all properties, make objects of this 
 * @author tet19171871
 *
 */
@Service
public class ToDo1Service
{
	Logger logger = LoggerFactory.getLogger(ToDo1Service.class);
	@Autowired
	private TaskRepository taskRepository;
	
	private ArrayList<ToDo1> homeToDo1;
	private ArrayList<ToDo1> completedToDo1;
			
	/**
	 * @return to-do list in home.html page
	 */
	public ArrayList<ToDo1> getHomeToDo1()
	{
		this.homeToDo1 = new ArrayList<ToDo1>();
// 		commented out below to replace iterables from mysql instead		
//		this.homeToDo1.add(new ToDo1( "Shivani","Cooking","Work in progress","Morning","High"));
//		this.homeToDo1.add(new ToDo1( "Srini","Cleaning","Work in progress","Afternoon","Medium"));
//		this.homeToDo1.add(new ToDo1( "Aarush","Sorting","Work in progress","Evening","Low"));
//		this.homeToDo1.add(new ToDo1( "Aayush","Painting","Work in progress","Night","Low"));
		
		return this.homeToDo1;
	}
//	
	/** 
	 * @return completed list in completed.html page
	 */
	public ArrayList<ToDo1> getCompletedToDo1()
	{
	
		this.completedToDo1 = new ArrayList<ToDo1>();
// 		commented out below to replace iterables from mysql instead			
//		this.completedToDo1.add(new ToDo1( "Shivani","Cooking","Completed","Morning","High"));
//		this.completedToDo1.add(new ToDo1( "Srini","Cleaning","Completed","Afternoon","Medium"));
//		this.completedToDo1.add(new ToDo1( "Aarush","Sorting","Completed","Evening","Low"));
//		this.completedToDo1.add(new ToDo1( "Aayush","Painting","Completed","Night","Low"));
		
		return this.completedToDo1;
	}
	
	/**
	 * shows the iterable list and logger page info on the console
	 */
	
//	public void getNumberOfTask()
//	{
//		logger.info("# of tasks {}", taskRepository.count());
//		
//		Iterable <ToDo1> todo1Tasks = taskRepository.findAll();
//		Iterator <ToDo1> iterator = todo1Tasks.iterator();
//		ArrayList<ToDo1> todoList = new ArrayList<ToDo1>();
//		while (iterator.hasNext())
//		{
//			//gives the info in the console of the iterable list from the task table in mysql
//			//logger.info("{}", iterator.next().toString());
//			//logger.info("# of tasks {}", taskRepository.count());
//			todoList.add(iterator.next());
//		}
//	}
	
	/**
	 * connects to todo database and shows up the iterables list from the task table 
	 */
	public ArrayList<ToDo1> getDBTasks()
	{
		logger.info("# of tasks {}", taskRepository.count());
		
		Iterable <ToDo1> todoTasks = taskRepository.findAll();
		Iterator <ToDo1> iterator = todoTasks.iterator();
		ArrayList<ToDo1> todoList = new ArrayList<ToDo1>();
		while (iterator.hasNext())
		{
			//gives the info in the console of the iterable list from the task table in mysql
			//logger.info("{}", iterator.next().toString());
			//logger.info("# of tasks {}", taskRepository.count());
			todoList.add(iterator.next());
			
		}
		//returns todoList from mysql task table			
		return todoList;
	}
		
}
