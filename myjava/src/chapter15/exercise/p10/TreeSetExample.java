package chapter15.exercise.p10;

import java.util.TreeSet;

import chapter15.Student;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet <Student> treeSet =new TreeSet <Student>();
		treeSet.add((new Student("blue",96));
		treeSet.add((new Student("hong",96));
		treeSet.add((new Student("white",96));
		
		Student student =treeSet.last();
		System.out.println("최고점수:" +student.score);
		System.out.println("최고점수를 받은 아이디:" +student.id);
		

	}

}
