package chapter03;

public class Logical {
	public static void main(String[] args) {
		// && || !
		// 피연산자의 타입은 boolean
		// 결과도 boolean

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println();
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println();
		System.out.println(!true);
		System.out.println(!false);
	

	}
}
