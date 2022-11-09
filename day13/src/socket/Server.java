package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		// 클라이언트가 접속할 수 있도록 대기하는 서버
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(1234);
		String msg;
		
		System.out.println("접속 대기중...");
		Socket so = ss.accept();
		
		System.out.println("대상이 연결되었습니다");
		System.out.print("클라이언트에게 보낼 메시지를 입력 : ");
		msg = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(so.getOutputStream());
		pw.append(msg);
		pw.flush();
		pw.close();
		sc.close();
		ss.close();
	}
}
