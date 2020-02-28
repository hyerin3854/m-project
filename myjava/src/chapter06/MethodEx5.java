package chapter06;

public class MethodEx5 {
	int field1;

	void method1(int field1) {
		this.field1 = field1;
		System.out.println(this.field1);
	}
	void method2(int field1) {
		method1(5);
		System.out.println(this.field1);
	}
}