package com.itbank.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.HomeplusDTO;
import com.itbank.service.HomeplusService;

@Controller
public class HomeplusController {
	
	@Autowired
	private HomeplusService homeplusService; 
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<HomeplusDTO> list = homeplusService.getList();
		mav.addObject("list", list);
		return mav;	
	}
	
	@PostMapping("/list")
	public ModelAndView search(@RequestParam HashMap<String, String> param) {
		ModelAndView mav = new ModelAndView("list");
		List<HomeplusDTO> list = homeplusService.selectOne(param);
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/add")
	public void insert() {}
	
	@PostMapping("/add")
	public String insert(HomeplusDTO dto) {
		homeplusService.insert(dto);
		return "redirect:/list";
	}		
}
