package chapter07.polymophism.section772;

public class SmartPhone {
	private Display display;
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public void displayOn() {
		
		
		display.powerOn();
		
	}
	

}
