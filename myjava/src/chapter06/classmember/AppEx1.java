package chapter06.classmember;

public class AppEx1 {
	public static void main(String[] args) {
		ClassMemberEx1 i1 = new ClassMemberEx1();
		i1.instanceVar1 = 5;
		i1.classVar1=99;
		ClassMemberEx1 i2 = new ClassMemberEx1();
		i2.instanceVar1 = 10;
		i2.classVar1=77;
		ClassMemberEx1.classVar1 = 55;
		
		System.out.println(i1.instanceVar1);
		System.out.println(i2.instanceVar1);
		System.out.println(i1.classVar1);
		System.out.println(i1.classVar1);
		
		System.out.println("-----------------------------");
		i1.instanceMethod();
		i2.instanceMethod();
		i1.classMethod();
		i2.classMethod();
		

	}

}
