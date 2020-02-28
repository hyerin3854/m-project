package chapter07.protect.other;

import chapter07.protect.SuperClass;

public class SubClass extends SuperClass {
	public static void main(String[] args) {
		SuperClass sc= new SuperClass();
		
//		sc.method();
//		sc.method2();
	}
void method3() {
	super.method();
}
}
