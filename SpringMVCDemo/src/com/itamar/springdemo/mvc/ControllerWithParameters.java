package com.itamar.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerWithParameters {

	@RequestMapping("/getFormV2")
	public String getFormV2()
	{
		return "helloworld-form2";
	}
	
	@RequestMapping("/processRequestV2")
	public String processResponse(HttpServletRequest request, Model model)
	{
		String name = request.getParameter("name");
		String surName = request.getParameter("surName");
		
		model.addAttribute("name", name);
		model.addAttribute("surName", surName);
		
		return "helloworld2";
	}
}
