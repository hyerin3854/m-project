package verify.exam07;

public class SnowTireExamplee {

	public static void main(String[] args) {
	SnowTire snowTire =new SnowTire();
	Tire tire=snowTire;
	
	snowTire.run();
	tire.run();
	}

}
