package chapter05;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열 만드는 방법
		// 1. 선언과 할당을 동시에
		int[] intArray1 = {-3, 1, 0};
		
		// 2. 선언과 할당할 때 배열의 크기만
		int[] intArray2 = new int[3];
		
		// 3. 선언 후 할당
		int[] intArray3;
//		intArray3 = {3, 2, 0}; //안됨
		intArray3 = new int[3];          //3.1. 크기만 할당
		intArray3 = new int[] {3, 2, 0}; //3.2. 값까지 할당
		
		
		// 배열을 읽는 방법
		// 하나씩 읽을 때
		System.out.println(intArray3[0]);
		
		System.out.println("---------");
		
		// for문 사용
		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}
		
		System.out.println("---------");
		
		// 향상된 for문 사용
		for (int item : intArray3) {
			System.out.println(item);
		}
		
		System.out.println("---------");
		// 값을 변경할 때
		intArray3[0] = 99;
		intArray3[2] = 101;
		
		for (int item : intArray3) {
			System.out.println(item);
		}
	}
}






