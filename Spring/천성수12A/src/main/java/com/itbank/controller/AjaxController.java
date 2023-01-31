package com.itbank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.service.CtprvnService;

@RestController
public class AjaxController {
	
	@Autowired CtprvnService ctprvnService;

	@GetMapping("/air")
	public String getCtprvnMesureLIst() throws IOException {
		String json = ctprvnService.getCtprvnMesureLIst();
		return json;
	}
}
