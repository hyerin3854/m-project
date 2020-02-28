package chapter11.object;

public class ObjectEx1 {
	public static void main(String[] args) {
		MyClass s1 =new MyClass();
		
		s1.setId(100);
		s1.setName("안나");
		
		String r1= s1.toString();
		System.out.println(r1);
		
		
		System.out.println(s1);
	}

}
