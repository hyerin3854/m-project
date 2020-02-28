package chapter06;

public class Car_KeyTurnOnEx1 {
	public static void main(String[] args) {
		Car_KeyTurnOn myCar = new Car_KeyTurnOn();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도:" + speed + "km/h");
	}

}
