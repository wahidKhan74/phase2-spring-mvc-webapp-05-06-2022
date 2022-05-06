package com.simplilearn.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/status")
	public ModelAndView indexMapping() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", "Spring MVC webserver");
		mv.addObject("message", "Server is up & running !");
		return mv;
	}
	
	
	@RequestMapping("/hello")
	public ModelAndView helloMapping(@RequestParam(name="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", username);
		mv.addObject("message", "Hello user, Today is a good day!");
		return mv;
	}
	
	
	@RequestMapping("/hi")
	public ModelAndView hiMapping(@RequestParam(name="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server", username);
		mv.addObject("message", "Hi user, Welcome to spring mvc");
		return mv;
	}
}
