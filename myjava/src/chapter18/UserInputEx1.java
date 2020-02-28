package chapter18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputEx1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		FileWriter fw = new FileWriter("user.txt");

		String user = null;
		boolean run = true;
		while (run) {
			System.out.println("입력>");
			user = scanner.next();
			if (user.contentEquals("exit")) {
				run = false;
			} else {
				fw.write(user);
				fw.write("\n");

			}
		}
		System.out.println("프로그램 종료");

		scanner.close();
		fw.close();
	}

}
