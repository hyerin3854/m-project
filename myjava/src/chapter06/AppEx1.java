package chapter06;

public class AppEx1 {
	public static void main(String[] args) {
		ClassEx1 refVar1 = new ClassEx1();
		ClassEx1 refVar2 = new ClassEx1();
		
		FieldEx1 newInstance1= new FieldEx1();
		FieldEx1 newInstance2= new FieldEx1();
		
		System.out.println(newInstance1.intField1);
		System.out.println(newInstance2.intField1);
		
		newInstance1.intField1=3;
		newInstance2.intField1=99;
		
		System.out.println(newInstance1.intField1);
		System.out.println(newInstance2.intField1);
	
	
	}
}
