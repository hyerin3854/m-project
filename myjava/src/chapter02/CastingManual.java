package chapter02;

public class CastingManual {
	public static void main(String[] args) {
		// type casting (auto)
		// 큰 범위의 type은 작은 범위의 type 으로
		// 강제 형변환 해야함.
//		#값을 잃어 버릴 수 있다는 것을 염두...

		int intVar1 = 2100000000;
		short shortVar1;
		shortVar1 = (short) intVar1;
		System.out.println(intVar1);
		System.out.println(shortVar1);
		
		intVar1 =10000;
		shortVar1=(short) intVar1;
		System.out.println(intVar1);
		System.out.println(shortVar1);

	}
}
