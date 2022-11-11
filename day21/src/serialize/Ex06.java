package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMDdfNTkg%2FMDAxNjMzNTg0NDA2NjIy.vOEkOW6O61_UvaNDX1wlklVgzdo_CnLjXHOHveR5cXgg.I-fFK3ptJPin4k3vhEa8mz3qqEM8xtKssR58U33pvhog.JPEG.gngnt2002%2FK-023.jpg&type=sc960_832";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다");
		System.out.print("원하는 파일명을 입력하세요 : ");
		fileName = sc.nextLine();
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
		sc.close();
	}
}
