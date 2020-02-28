package chapter03;

public class Ternary {
	public static void main(String[] args) {
//	삼항연산자
		// 피연산자1 ? 피연산자2 : 피연산자3
		// 연산의 결과는 피연산자2 or 피연산자3

		// 피연산자1이 true면 피연산자2
		// 피연산자1이 false면 피연산자3

		int age = 30;
		String result = (age > 20) ? "어른" : "아이";

		System.out.println(result);

	}
}
