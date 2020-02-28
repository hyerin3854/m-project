package chapter10.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputNumberFile {
	public static void main(String[] args) {
		File file = new File("numbers.txt");
		Scanner scanner = null;
		long sum = 0;
		int strCount = 0;

		try {
			scanner = new Scanner(file);
			System.out.println("파일을 찾았습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
		while (scanner.hasNext()) {
			String s = scanner.next();
			try {
				int num = Integer.parseInt(s);
				sum += num;
			} catch (NumberFormatException e) {
				strCount++;
			}
		}
		
		System.out.println("총합:" + sum);
		System.out.println("String:" + strCount);
		
		scanner.close();
	}
}




