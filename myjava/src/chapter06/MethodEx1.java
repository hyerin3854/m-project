package chapter06;

public class MethodEx1 {
	public static void main(String[] args) {
		double b = method5(30);
		System.out.println(b);
		int a = method4();
		System.out.println(a);
		method3(55, 22);
		method2(99);
		method2(88);
		method1();

	}

	public static double method5(int line) {

		return 3.14 * line;
	}

	public static int method4() {
		return 3;

	}

	public static void method3(int a, int b) {
		System.out.println(a + "," + b);
	}

	public static void method2(int a) {
		System.out.println(a);

	}

	public static void method1() {
		System.out.println("method1 실행");
	}
}