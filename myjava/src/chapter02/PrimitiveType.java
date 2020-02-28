package chapter02;

public class PrimitiveType {
	public static void main(String[] args) {
		// 정수형
		// byte(1byte), short(2byte), int(4byte), long(8byte)

		// 실수형
		// float(4byte) , double(8byte)

		// 문자형
		// char

		// 논리형
		// boolean

		/*****************************************/
		// byte
		System.out.println("byte형의 범위");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		byte byteVar1 = -128;
		System.out.println(byteVar1);

		byteVar1 = 127;
		System.out.println(byteVar1);

//		byteVar1 = 128;

		/*****************************************/
		// short
		System.out.println("short형의 범위");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		short shortVar1 = -30000;
//		shortVar1 = -40000;

		/*****************************************/
		// int
		System.out.println("int형의 범위");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		int intVar1 = 2100000000;

		/*****************************************/
		// long
		System.out.println("long형의 범위");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		long longVar1 = 220000000000L;

		/*****************************************/
		// float
		System.out.println("float형의 범위");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		float floatVar1 = 3.14F;
		/*****************************************/
		// double
		System.out.println("double형의 범위");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		double doubleVar1 = 3.14;

		/*****************************************/
		// char
		System.out.println("char형의 범위");
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);

		char charVar1 = 'a';
		System.out.println(charVar1);
		charVar1 = 65;
		System.out.println(charVar1);

		/*****************************************/
		// boolean
		System.out.println("boolean형의 범위");
		boolean booleanVar1 = true;
		booleanVar1 = false;

	}

}
