package chapter07.override;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa =new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode= SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
	}

}
