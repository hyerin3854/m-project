package chapter04;

import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수는:");
		String input = scanner.nextLine();

		System.out.println(input);

		int point = Integer.parseInt(input);
		if (100 >= point && point >= 90) {
			System.out.println("A학점 입니다.");
		} else if (90 > point && point >= 80) {
			System.out.println("B학점 입니다");
		}

		else if (80 > point && point >= 70) {
			System.out.println("C학점 입니다");
		}

		else if (70 > point && point >= 60) {
			System.out.println("D학점 입니다");
		}

		else if (60 > point && point >= 0) {
			System.out.println("F학점 입니다");
		} else {
			System.out.println("점수 오류");
		}

	}
}
