package chapter07;

public class AppEx1 {
public static void main(String[] args) {
	SubClass sc= new SubClass();
	sc.i=99;
	sc.j=100;
	sc.method();
	sc.method2();
	
	SuperClass su= new SuperClass();
//	su.j=100;
}
}
