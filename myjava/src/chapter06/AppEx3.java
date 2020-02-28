package chapter06;

public class AppEx3 {
	public static void main(String[] args) {
		MethodEx5 th1 = new MethodEx5();
		th1.method1(3);
		System.out.println(th1.field1);

		MethodEx5 th2 = new MethodEx5();
		th2.method1(7);
		System.out.println(th2.field1);

		MethodEx3 re1 = new MethodEx3();
		int r = re1.method1();
		double s = re1.method2();

		System.out.println(r);

		System.out.println("-------------------");

		MethodEx2 me1 = new MethodEx2();
		me1.method1();
		me1.method2(9);
		me1.method3(10, 20);

		MethodEx2 me2 = new MethodEx2();
		me2.method1();
		me2.method2(3);
		me2.method3(99, 98);
	}
}
