package chapter15.arraylist;

import java.util.ArrayList;
import chapter15.Student;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList</* Student -instance 타입 파라미터 생략 가능 */>();

		Student s1 = new Student();
		s1.setName("안나");
		s1.setMath(80);

		Student s2 = new Student();
		s2.setName("엘사");
		s2.setMath(85);

		Student s3 = new Student();
		s3.setName("올라프");
		s3.setMath(75);

		students.add(s1);
		students.add(s2);
		students.add(s3);

		System.out.println(students.get(0).getName());

		Student s4 = new Student();
		s4.setName("스벤");
		s4.setMath(60);

		students.add(s4);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());

		}
		students.remove(2);
		System.out.println();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}

	}
}
