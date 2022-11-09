package day02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODEyMDhfMjI5%2FMDAxNTQ0Mjc3MDMwMzUx.9xUwPVR-_lmQZVTV8Ti_tau5p4Kv1b4MPc1vNfgGTVog.Z4zsZjhGOi1DW8i_9Q4XnPCN6GuJJPOfvXDyN6ONpuUg.PNG.godhot1146%2FScreenshot_20180624-023459.png&type=sc960_832";
				
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			bis = new BufferedInputStream(new URL(path).openStream());
			fos = new FileOutputStream(new File("my.jpg"));
			
			byte[] buffer = new byte[1024];		// 버퍼, 1바이트씩 처리하면 함수
			int count, total = 0;
			
			while ((count = bis.read(buffer, 0, 1024)) != -1) {
				total += count;
				System.out.println(total);
				fos.write(buffer, 0, count);
			}
		} finally {
			bis.close();
			fos.close();			
		}
		System.out.println("끝");
		
	}

}
