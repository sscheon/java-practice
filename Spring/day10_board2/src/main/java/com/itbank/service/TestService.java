package com.itbank.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.repository.TestDAO;

@Service
public class TestService {
	
	@Autowired
	private TestDAO dao;

	public String getVersion() {
		return dao.getVersion();
	}

	public Date getDate() {
		return dao.getDate();
	}

}
