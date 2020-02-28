package chapter15.arraylist;

import java.util.*;
import chapter15.Student;

public class ArrayListEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.print("이름>");
			String name = scanner.next();
			System.out.print("점수>");
			int math = scanner.nextInt();

			Student s = new Student();
			list.add(s);
			s.setName(name);
			s.setMath(math);

		}
		for (Student s : list) {
			System.out.println(s);
		}

	}

}
