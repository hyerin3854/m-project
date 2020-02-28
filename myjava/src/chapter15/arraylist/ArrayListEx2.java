package chapter15.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(15);
		numbers.add(99);
		numbers.add(101);
		numbers.add(123);
		numbers.add(1, 31);
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		System.out.println();

		numbers.add(1, 31);

		for (Integer i : numbers) {
			System.out.println(i);
		}
		System.out.println();
		
		int n=numbers.get(2);
		System.out.println(n);
		
		numbers.remove(2);
		System.out.println();
		for (Integer i : numbers) {
			System.out.println(i);
		}
	}
}