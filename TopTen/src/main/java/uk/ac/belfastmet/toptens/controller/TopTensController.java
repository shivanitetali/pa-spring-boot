package uk.ac.belfastmet.toptens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.toptens.service.TopTenService;

@Controller
@RequestMapping
public class TopTensController
{

	@GetMapping()
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/international")
	public String internationalPage(Model model)
	{
		TopTenService toptenService = new TopTenService();
		model.addAttribute("pageTitle", "International TopTen");
		model.addAttribute("toptens", toptenService.getInternationalTopTens());
		
		
		return "international";
	}
	
	@GetMapping("/indian")
	public String IndianPage(Model model)
	{
		TopTenService toptenService = new TopTenService();
		model.addAttribute("pageTitle", "Indian TopTen");
		model.addAttribute("toptens", toptenService.getIndianTopTens());
		return "indian";
	}
}














//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import uk.ac.belfastmet.toptens.service.TopTenService;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//
//@Controller
//public class TopTensController
//{
//
//	Logger logger = LoggerFactory.getLogger(TopTensController.class);
//	
//		@GetMapping()
//		public String homePage()
//		{
//		
//			logger.info("Getting Home Page");
//			return "index";
//		}
//		
//		@GetMapping("/international")
//		public String internationalPage(Model model)
//		{
//			TopTenService toptenService = new TopTenService();
//			model.addAttribute("pageTitle", "International TopTens");
//			model.addAttribute("toptens", toptenService.getInternationalTopTens());
//			
//			
//			return "international";
//		}
//		
//		@GetMapping("/indian")
//		public String indianPage(Model model)
//		{
//			TopTenService toptenService = new TopTenService();
//			model.addAttribute("pageTitle", "Indian TopTens");
//			model.addAttribute("toptens", toptenService.getIndianTopTens());
//			return "indian";
//		}
	

