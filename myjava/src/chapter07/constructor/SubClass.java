package chapter07.constructor;

public class SubClass extends SuperClass {
	int k;

	public SubClass(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	
	public SubClass(int i, int j) {
		super(i, j);
	}
}
