package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")

public class ToyStoryController
{
	
	@GetMapping("")
	public String home()
	{
		return "This is the Home Page of ToyStory movie";
	}
	
	@GetMapping("/woody")
	public String woody()
	{
		return "Woody is a Hero of the movie";
	}

	@GetMapping("/buzz")
	public String buzz()
	{
		return "Buzz is a space man who keeps saying: infinity and beyond";
	}


}


