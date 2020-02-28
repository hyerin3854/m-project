package chapter06.access1;

public class Appex1 {

	public static void main(String[] args) {
		MyCapsule c = new MyCapsule();
		c.setId(900);
		c.setName("오메가");
		c.setModel("omega3");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getModel());

		MyClass i = new MyClass();
		// System.out.println(i.defaultVar);
		System.out.println(i.publicVar);
		// System.out.println(i.privateVar);

	}

}
