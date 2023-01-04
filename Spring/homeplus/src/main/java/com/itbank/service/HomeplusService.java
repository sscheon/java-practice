package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.HomeplusDTO;
import com.itbank.repository.HomeplusDAO;

@Service
public class HomeplusService {
	
	java.util.Date day = new java.util.Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String now = sdf.format(day);
	
	@Autowired
	private HomeplusDAO dao;
	
	private final String saveDirectory = "D:\\upload_2023";
	
	public HomeplusService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}

	public List<HomeplusDTO> getList() {
		return dao.selectAllList();
	}

	public int insert(HomeplusDTO dto) {
		String str = now + "_" + dto.getProductName();
		File dest = new File(saveDirectory, str + "_thumbnail");
		File dest2 = new File(saveDirectory, str + "_review");
		try {
			dto.getFileName().transferTo(dest);
			dto.setThumbnail(str + "_thumbnail");
			
			dto.getFileName2().transferTo(dest2);
			dto.setReviewImage(str + "_review");
			
			int row = dao.insert(dto);
			return row;
			
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		} 		
		return 0;
	}

	public List<HomeplusDTO> selectOne(HashMap<String, String> param) {
		return dao.selectOne();
	}


}
