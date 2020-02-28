package chapter03;

public class Arithmetic {
	public static void main(String[] args) {
		// + - % / % ++ --
		int intVar1 = 10;
		int intVar2 = 30;
		System.out.println(intVar1 + intVar2);
		System.out.println(intVar1 - intVar2);
		System.out.println(intVar1 * intVar2);
		System.out.println(intVar1 / intVar2);
		System.out.println(intVar1 % intVar2);
		intVar1++;
		System.out.println(intVar1);
		intVar2--;
		System.out.println(intVar2);

//		다른 타입과 연산하는 경우
//		큰 타입으로 자동 변환 후 연산
		int intVar3 = 50;
		double doubleVar3 = 3.14;
		System.out.println(intVar3 + doubleVar3);
		System.out.println(intVar3 - doubleVar3);
		System.out.println(intVar3 * doubleVar3);
		System.out.println(intVar3 / doubleVar3);
		System.out.println(intVar3 % doubleVar3);
//	연산시 주의 할 점
//		overflow

		int intVar4 = 2100000000;
		int intVar5 = 2100000000;
		int intVar6 = intVar4 + intVar5;
		System.out.println(intVar4 + intVar5);
		System.out.println(intVar6);

		long longVar1 = (long) intVar4 + intVar5;
		System.out.println(longVar1);
	}

}
