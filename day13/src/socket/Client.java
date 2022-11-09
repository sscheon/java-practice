package socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ip, msg;
		int port;
		
		System.out.print("서버의 IP를 입력 : ");
		ip = sc.nextLine();
		port = 1234;
		PrintWriter pw;
		
		Socket so = new Socket(ip, port);
		System.out.println("서버에 접속되었습니다");
		

		
		do {
			Scanner input = new Scanner(so.getInputStream());
			msg = input.nextLine();
			System.out.print("서버로부터의 메시지 : ");
			System.out.println(msg);
			
		}while(!(msg.equals("종료")));

		input.close();
		so.close();
		sc.close();
		pw.close();
		
		System.out.println("클라이언트 종료");
	}
}
