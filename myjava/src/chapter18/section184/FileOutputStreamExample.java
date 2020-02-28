package chapter18.section184;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample  {
	public static void main(String[] args)throws Exception {
		String originalFileName ="C:/Temp/초코1.jpg";
		String targetFileName ="C:\\Users\\USER\\Documents/초코2.jpg";
		
		FileInputStream fis =new FileInputStream(originalFileName);
		FileOutputStream fos= new FileOutputStream(targetFileName);
		
		int readByteNo;
			byte [] readBytes =new byte[100];
		while((readByteNo=fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
			System.out.println(readByteNo);
			
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사가 잘 되었습니다.");
		System.out.println(readByteNo);		
				
	}

}
