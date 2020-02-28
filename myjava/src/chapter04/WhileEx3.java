package chapter04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int user;
		int com;
		
		while (true) {
			System.out.print("1.가위 2.바위 3.보 :");
			user = scanner.nextInt();
			com = random.nextInt(3) + 1;
			
			System.out.println("컴퓨터: " + com);
			
			if (user == com) {
				System.out.println("비겼습니다.");
			} else if (com == 1 && user == 3) {
				System.out.println("졌습니다.");
			} else if (com == 2 && user == 1) {
				System.out.println("졌습니다.");
			} else if (com == 3 && user == 2) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
				break;
			}
		}
		
		System.out.println("게임 종료");
	}
}





