package uk.ac.belfastmet.ToDo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.ToDo1.domain.ToDo1;
import uk.ac.belfastmet.ToDo1.repository.TaskRepository;
import uk.ac.belfastmet.ToDo1.service.ToDo1Service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestMapping
@Controller

//this class calls  the Service class to populate the info on the website ,takes the info from the DB
public class ToDo1Controller

{
	@Autowired
	private ToDo1Service  todo1Service;
	
	//returns the logger info on the console
	Logger logger = LoggerFactory.getLogger(ToDo1Controller.class);
	ToDo1 todo1 = new ToDo1();
	
	/**
	 * todo constructor accepts following parameteres
	 * @param model created for home page
	 * @return home.html
	 */	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model)
	{
		logger.info("Getting Home Page");
		logger.info(todo1.toString());
		
		//@Autowired replaces the below line			
		//ToDo1Service todo1Service = new ToDo1Service();
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("todo1", todo1Service.getHomeToDo1());
			
		//message typed here will be on the website from the home.html
		model.addAttribute("message", "To-Do Tasks");
		
		todo1Service.getNumberOfTask();
		todo1Service.getDBTasks();
		
		//calling the DB service to populate on the website	from the home.html	
		ArrayList<ToDo1> tasks = todo1Service.getDBTasks();
		model.addAttribute("tasks", tasks);
		
		return "home";
	}
	
	/**
	 * @param model created for completed page
	 * @return completed.html
	 */
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String completedPage(Model model)
	{
		logger.info("Getting Completed Page");
		logger.info(todo1.toString());
		
		//@Autowired replaces the below line	
		//ToDo1Service todo1Service = new ToDo1Service();
		model.addAttribute("pageTitle", "Completed");
		model.addAttribute("todo1", todo1Service.getCompletedToDo1());
		
		//will give the message typed here on the website from the completed.html
		model.addAttribute("message", "Completed Tasks");
		
		todo1Service.getNumberOfTask();
		todo1Service.getDBTasks();
		
		//calling the DB service to populate on the website	in the completed page
		ArrayList<ToDo1> tasks = todo1Service.getDBTasks();
		model.addAttribute("title", tasks);
		
		
		return "completed";
	}
	
	
}

