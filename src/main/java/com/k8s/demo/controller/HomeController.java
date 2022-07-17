package com.k8s.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.k8s.demo.service.MemberService;

@Controller
public class HomeController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/hello")
	public String greeting(Model model) {
		String id = (String) model.getAttribute("id");
		String name = memberService.getName(id);
		model.addAttribute("name", name);
		return "hello";
	}
}
