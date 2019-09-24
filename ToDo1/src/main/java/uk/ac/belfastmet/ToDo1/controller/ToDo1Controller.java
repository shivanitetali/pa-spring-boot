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
	
	Logger logger = LoggerFactory.getLogger(ToDo1Controller.class);
	ToDo1 todo1 = new ToDo1();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String homePage(Model model)
	{
		
			logger.info("Getting Home Page");
			logger.info(todo1.toString());
			
			ToDo1Service todo1Service = new ToDo1Service();
			model.addAttribute("pageTitle", "Home");
			model.addAttribute("todo1", todo1Service.getHomeToDo1());
			
			model.addAttribute("message", "To-Do Tasks");
			
			return "home";
			
			
	}

	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	
	public String completedPage(Model model)
	{
		
		logger.info("Getting Completed Page");
		logger.info(todo1.toString());
		
		ToDo1Service todo1Service = new ToDo1Service();
		model.addAttribute("pageTitle", "Completed");
		model.addAttribute("todo1", todo1Service.getCompletedToDo1());
		
		model.addAttribute("message", "Completed Tasks");
		
		return "completed";
	}
}

