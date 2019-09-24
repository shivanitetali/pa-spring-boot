package uk.ac.belfastmet.ToDo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.ToDo1.domain.ToDo1;
import uk.ac.belfastmet.ToDo1.service.ToDo1Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RequestMapping
@Controller


public class ToDo1Controller
{
	//returns the logger info
	Logger logger = LoggerFactory.getLogger(ToDo1Controller.class);
	ToDo1 todo1 = new ToDo1();
	
	/**
	 * 
	 * @param model
	 * @return homepage
	 */	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model)
	{
		logger.info("Getting Home Page");
		logger.info(todo1.toString());
			
		ToDo1Service todo1Service = new ToDo1Service();
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("todo1", todo1Service.getHomeToDo1());
			
		//message typed here will be on the website
		model.addAttribute("message", "To-Do Tasks");
			
		return "home";
		
	}
	
	/**
	 * 
	 * @param model
	 * @return completed page
	 */
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String completedPage(Model model)
	{
		logger.info("Getting Completed Page");
		logger.info(todo1.toString());
		
		ToDo1Service todo1Service = new ToDo1Service();
		model.addAttribute("pageTitle", "Completed");
		model.addAttribute("todo1", todo1Service.getCompletedToDo1());
		
		//will give the message typed here on the website
		model.addAttribute("message", "Completed Tasks");
		
		return "completed";
	}
}

