package chapter10.section1050;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("numbers.txt");
				FileOutputStream fos = new FileOutputStream("n.txt");

		) {
			int r =-1;
			while ((r=fis.read())!=-1) {
				fos.write(r);;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사 완료");

	}

}
