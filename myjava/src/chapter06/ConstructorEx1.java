package chapter06;

public class ConstructorEx1 {
	int intField1;
	int intField2;
	
	public ConstructorEx1() {
//		intField1 = 33;
//		intField2 = 99;
//		System.out.println("인스턴스 초기화됨");
		this(33, 99);
	}
	
	public ConstructorEx1(int i) {
//		intField1 = i;
//		intField2 = 99;
//		System.out.println("인스턴스 초기화됨");
		this(i, 99);
	}
	
	public ConstructorEx1(int intField1, int intField2) {
		this.intField1 = intField1;
		this.intField2 = intField2;
		System.out.println(this.intField1);
		System.out.println(this.intField2);
		System.out.println("인스턴스 초기화됨");
	}
	
	public ConstructorEx1(int j, String s) {
		
	}
	
	public ConstructorEx1(String s, int j) {
		
	}
}



