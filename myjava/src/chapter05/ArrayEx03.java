package chapter05;

import java.util.Random;

public class ArrayEx03 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[6];

		int i = 0;
		while (i < numbers.length) {
			int newNumber = random.nextInt(45) + 1;

			int j = 0;
			while (j < i) {
				if (numbers[j] == newNumber) {
					break;

				}
				j++;
			}
			if (j == i) {
				numbers[i] = newNumber;
				i++;
			}

		}
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
