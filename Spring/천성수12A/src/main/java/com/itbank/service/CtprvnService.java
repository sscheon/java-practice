package com.itbank.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CtprvnService {
	
	public String getCtprvnMesureLIst() throws IOException {
		String url = "http://apis.data.go.kr/B552584/ArpltnStatsSvc/getCtprvnMesureLIst";
		
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("serviceKey", "BUqn7KhXDZy%2BSvuyPyUSFqWhhfFcBR9tNIZLD%2F1jb9lFjFyQnK4SQM42exU70wRahiqpq6wmf8c%2BH37JG7b6zw%3D%3D");
		params.put("returnType", "json");
		params.put("numOfRows", "100");
		params.put("pageNo", "1");
		params.put("itemCode", "PM10");
		params.put("dataGubun", "DAILY");
		params.put("searchCondition", "MONTH");
		
		url += "?";
		for(String key : params.keySet()) {
			url += key + "=" + params.get(key) + "&";
		}
		
		URL requestURL = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection();
		String ret = "";
		if(conn.getResponseCode() == 200) {
			Scanner sc = new Scanner(conn.getInputStream());
			while(sc.hasNextLine()) {
				ret += sc.nextLine();
			}
			sc.close();
			conn.disconnect();
			return ret;
		}
		
		return null;
	}

	

}
