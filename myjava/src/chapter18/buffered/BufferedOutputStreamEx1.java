package chapter18.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("out.txt");
		int loop = 1 * 1024 * 1024;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			fos.write(97);
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "밀리초, 작성완료.");
		
		fos.flush();
		fos.close();
		///////////////////////////
		FileOutputStream fos2 = new FileOutputStream("out.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		start = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			bos.write(97);
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "밀리초, 작성완료.");
		
		bos.flush();
		bos.close();
	}
}



