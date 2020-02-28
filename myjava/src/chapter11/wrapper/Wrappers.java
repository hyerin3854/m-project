package chapter11.wrapper;

public class Wrappers {
	public static void main(String[] args) {
		byte b1 = 23;
		Byte b2 = new Byte(b1);
		b1 = b2.byteValue();
		short s1 = 234;
		Short s2 = new Short(s1);
		s1 = s2.shortValue();
		int i1 = 98765;
		Integer i2 = new Integer(i1);
		i1 = i2.intValue();
		long l1 = 987611234;
		Long l2 = new Long(l1);
		l1 = l2.longValue();
		float f1 = 3.14F;
		Float f2 = new Float(f1);
		f1 = f2.floatValue();
		double d1 = 3.14;
		Double d2 = new Double(d1);
		d1 = d2.doubleValue();
		boolean bn1 = false;
		Boolean bn2 = new Boolean(bn1);
		bn1 = bn2.booleanValue();
		char c1 = 'a';
		Character c2 = new Character(c1);
		c1 = c2.charValue();

	}
}
