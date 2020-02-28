package chapter05;

public class ArrayEx1 {
	public static void main(String[] args) {
		int intVar1 = 3;
		String strVar1 = "경자";

		// 배열타입 변수명 ={값1,값2 ...};
		int[] intArrayVar1 = { 1, -2, 0 };
		String[] strArrayVar1 = { "merry", "new" };

		// 배열의 길이만
		int[] intArrayVar2 = new int[5];
		intArrayVar2[2] = 9;
		for (int i = 0; i < intArrayVar2.length; i++) {
			System.out.println(intArrayVar2[i]);
		}

		for (int i :intArrayVar2) {
			System.out.println(i);
			
		} 
		
		// 배열의 길이를 변경할 수 없다.
		intArrayVar1[0] = 5;
		intArrayVar1[1] = 9;
		intArrayVar1[2] = 15;
		// intArrayVar1[3]=99;//안됨.

		System.out.println(intArrayVar1[0]);
		System.out.println(intArrayVar1[1]);
		System.out.println(intArrayVar1[2]);
	}

}
