package chapter04;

import java.util.Scanner;

public class SwitchCaseEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("등급은:");
		String level = scanner.nextLine();

		switch (level) {
		case "A":
		case "a":

			System.out.println("90점 이상입니다.");
			break;
		case "B":
		case "b":
			System.out.println("80점 이상입니다.");
			break;
		case "C":
		case "c":
			System.out.println("70점 이상입니다.");
			break;
		case "D":
		case "d":
			System.out.println("60점 이상입니다.");
			break;
		case "F":
		case "f":
			System.out.println("60점 미만입니다.");
			break;
		default:
			System.out.println("등급 오류");
			break;
		}

	}
}
