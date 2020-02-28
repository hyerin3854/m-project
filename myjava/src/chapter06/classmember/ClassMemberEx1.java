package chapter06.classmember;

public class ClassMemberEx1 {
	int instanceVar1;
//	class 변수,class 필드
//	static 변수,static 필드
	static int classVar1; // class 변수, class 필드

	void instanceMethod() {
		System.out.println("정보:" + this.instanceVar1);
	}

	// class 메소드, static 메소드
	static void classMethod() {
		System.out.println("클래스정보:" + classVar1);
	}
}
