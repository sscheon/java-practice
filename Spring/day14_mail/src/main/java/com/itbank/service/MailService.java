package com.itbank.service;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
	
	@Value("classpath:account.txt")
	private Resource account;

	public int sendMail(String dst, String text) throws IOException {
		
		Scanner sc = new Scanner(account.getFile());
		String accountInfo = null;
		while(sc.hasNextLine()) {
			accountInfo = sc.nextLine();
		}
		sc.close();
		
		// 네이버 smtp를 사용하기 위한 설정
		String host = "smtp.naver.com";
		int port = 465;
		final String serverId = accountInfo.split("/")[0];
		final String serverPw = accountInfo.split("/")[1];
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", host);
		
		Session mailSession = Session.getDefaultInstance(props, new Authenticator() {
			String un = serverId;
			String pw = serverPw;
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(un, pw);
			}
		});
		mailSession.setDebug(true);
		
		Message mimeMessage = new MimeMessage(mailSession);
		
		// 단순 텍스트가 아니라 HTML형식으로 메일을 보내고 싶다면
		String body = "";
		body += "<div style=\"padding: 10px; border: 3px solid #dadada;\">";
		body += "	<h3>이 메일은 1894년 영국에서 시작되어...</h3>";
		body += "	<p>인증번호는 [<b>%s</b>]입니다</p>";
		body += "</div>";
		
		
		try {
			mimeMessage.setFrom(new InternetAddress("tjdcks8989@naver.com"));
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(dst));
			mimeMessage.setSubject("인증번호입니다");
			//mimeMessage.setText(text);	// 단순 텍스트로 메일을 보낼 경우
			body = String.format(body, text);
			mimeMessage.setContent(body, "text/html; charset=utf-8");	// 태그 및 스타일 적용
			Transport.send(mimeMessage);
			return 1;
		} catch (AddressException e) {
			e.printStackTrace();
			System.out.println("잘못된 주소입니다");
			return -1;
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("메세지 전송에 문제가 발생했습니다");
			return -2;
		}
	}

}
