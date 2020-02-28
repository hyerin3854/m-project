package chapter04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber;
		int userNumber;

		randomNumber = random.nextInt(100) + 1;
		//System.out.println(randomNumber);

		while (true) {
			System.out.println("예상?:");
			userNumber = scanner.nextInt();

			if (userNumber == randomNumber) {
				System.out.println("정답입니다.");
				break;
			} else if (userNumber > randomNumber) {
				System.out.println("더 작은 수를 예상해보세요.");
			} else {
				System.out.println("더 큰 수를 예상해보세요.");

			}
		}
	}

}
