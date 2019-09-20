package uk.ac.belfastmet.toptens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.toptens.domain.TopTen;
import uk.ac.belfastmet.toptens.service.TopTenService;

//@Controller
//@RequestMapping
//public class TopTensController
//{
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String homePage()
//	{
//		return "home";
//	}
//	
//	@GetMapping("/international")
//	public String internationalPage(Model model)
//	{
//		TopTenService toptenService = new TopTenService();
//		model.addAttribute("pageTitle", "International TopTen");
//		model.addAttribute("toptens", toptenService.getInternationalTopTens());
//		
//		
//		return "international";
//	}
//	
//	@GetMapping("/indian")
//	public String IndianPage(Model model)
//	{
//		TopTenService toptenService = new TopTenService();
//		model.addAttribute("pageTitle", "Indian TopTen");
//		model.addAttribute("toptens", toptenService.getIndianTopTens());
//		return "indian";
//	}
//}
//
//













import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RequestMapping
@Controller
public class TopTensController
{

	Logger logger = LoggerFactory.getLogger(TopTensController.class);
	TopTen topten = new TopTen();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String homePage()
{
	logger.info("Getting Home Page");
	logger.info(topten.toString());
	return "home";
}

	@GetMapping("/international")
	public String internationalPage(Model model)
	{			TopTenService toptenService = new TopTenService();
	model.addAttribute("pageTitle", "International TopTens");
	model.addAttribute("toptens", toptenService.getInternationalTopTens());


	return "international";
	}

	@GetMapping("/indian")
	public String indianPage(Model model)
	{
		TopTenService toptenService = new TopTenService();
		model.addAttribute("pageTitle", "Indian TopTens");
		model.addAttribute("toptens", toptenService.getIndianTopTens());
		return "indian";
	}
}

