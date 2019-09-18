package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shrekmovie")
//need to put /shrekmovie/shrek or donkey
public class ShrekController 
{
	
	@GetMapping("/")
	public String home()
	{
		return "This is the Home Page of Shrek movie";
	}
	
	@GetMapping("/shrek")
	public String shrek()
	{
		return "Shrek was played by Mike Myers";
	}

	@GetMapping("/donkey")
	public String donkey()
	{
		return "Donkey was played by Eddie Murphy";
	}
}
