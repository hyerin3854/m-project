package chapter07.override;

public class SubClass extends SuperClass {

	@Override
	void method() {
		super.method();
		System.out.println("sub method");
	}
}
