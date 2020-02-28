package chapter05;

public class RefTypeEx1 {

	public static void main(String[] args) {
		int a = 0;
		int[] arr = new int[3];

		a=3;
		arr[0] =9;
		
		arr=new int[2];
		
		System.out.println(arr[9]);
	}

}
