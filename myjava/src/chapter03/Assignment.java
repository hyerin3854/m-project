package chapter03;

public class Assignment {
	public static void main(String[] args) {
		// = += -= *= /= %=

		int intVar1 = 50;
		intVar1 += 70;
		System.out.println(intVar1);

		intVar1 -= 80;
		System.out.println(intVar1);

		intVar1 /= 3;
		System.out.println(intVar1);

		intVar1 %= 5;
		System.out.println(intVar1);

		/***************************************/
		// 복합할단연산자는 강제 형변환이 일어남.
		intVar1 += 3; // intVar1=intVar1 +3;

		intVar1 = intVar1 + 3;
		// intVar1= intVar1+3L;
		intVar1 += 3L;// intVar1= (int)(intVar1+3L) ;

	}

}
