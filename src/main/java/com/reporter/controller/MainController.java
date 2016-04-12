package com.reporter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reporter.model.CandidateModel;
import com.reporter.service.CandidateService;

@Controller
public class MainController {
	
	@Autowired
	private CandidateService candidateService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		CandidateModel candidate = candidateService.getCandidateName();
		mv.addObject("candidateName", candidate);
		mv.setViewName("home");
		return mv;
	}
}

