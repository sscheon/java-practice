package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.HomeplusDTO;
import com.itbank.repository.HomeplusDAO;

@Service
public class HomeplusService {
	
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

	// 업로드 받은 파일 이름의 새로운 파일 이름을 반환하는 함수 (문자열 처리)
	private String[] makeFileName(HomeplusDTO dto) {
		String thumbnailName = dto.getFileName().getOriginalFilename();
		String reviewImageName = dto.getFileName2().getOriginalFilename();
		
		// 1) 서로 다른 두개의 파일에 날짜, 상품이름, (thumbnail/reviewImage), 확장자를 이용하여 새 이름을 구성
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String ext1 = thumbnailName.substring(thumbnailName.lastIndexOf("."));
		String ext2 = reviewImageName.substring(reviewImageName.lastIndexOf("."));
		
		String fileName1 = today + "_" + dto.getProductName().replace(" ", "_") + "_thumbnail" + ext1;
		String fileName2 = today + "_" + dto.getProductName().replace(" ", "_") + "_review" + ext2;
		
		// 2) 두개의 이름을 split할수 있도록 묶어서 반환하거나, String[] 로 반환
		System.out.println(fileName1);
		System.out.println(fileName2);
		return new String[] { fileName1, fileName2 };
	}
	
	public int insert(HomeplusDTO dto) {
		// 1) 파일을 업로드 한다 (파일이름 새로 변경해주기)
		MultipartFile thumbnail = dto.getFileName();
		MultipartFile reviewImage = dto.getFileName2();
		
		String[] newName = makeFileName(dto);
		
		File dest = new File(saveDirectory, newName[0]);
		File dest2 = new File(saveDirectory, newName[1]);
		
		int row = 0;
		
		try {
			thumbnail.transferTo(dest);
			reviewImage.transferTo(dest2);
			
			dto.setThumbnail(newName[0]);
			dto.setReviewImage(newName[1]);
			
		// 2) 변경된 파일이름을 포함하는 dto를 dao에게 전달한다
			row = dao.insert(dto);
			
			
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		} 		
		return row;
		
	}

	public List<HomeplusDTO> selectOne(HashMap<String, String> param) {
		return dao.selectOne();
	}

	public HomeplusDTO get(int idx) {
		return dao.view(idx);
	}


}
