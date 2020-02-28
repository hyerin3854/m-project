package chapter07.polymophism.section772;

public class SamsungDisplay extends Display{

	@Override 
	public void powerOn() {
		System.out.println("화면을 켜고, 삼성 로고를 띄웁니다.");
	}
}
