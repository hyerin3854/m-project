package chapter07.protect.package2;

import chapter07.protect.package1.A;

public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}