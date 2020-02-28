package chapter04;

import java.util.Scanner;

public class IfElseEx1 {
	public static void main(String[] args) {
		int intVar1 = 30;

		Scanner scanner = new Scanner(System.in);

		System.out.print("나이는 :");
		String input = scanner.nextLine();

		intVar1 = Integer.parseInt(input);

		System.out.println(input);

		if (intVar1 > 20) {
			System.out.println("어른입니다.");
		} else if(intVar1>10) {
			System.out.println("학생입니다");
		}
		else {
			System.out.println("아이입니다.");

		}
	}
}
