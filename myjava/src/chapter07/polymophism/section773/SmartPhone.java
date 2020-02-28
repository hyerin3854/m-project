package chapter07.polymophism.section773;

public class SmartPhone {

	private Button[] buttons;

	public SmartPhone() {
		buttons = new Button[2];

	}

	public void setPowerButton(Button button) {
		buttons[0] = button;
	}

	public void setVolumeButton(Button button) {
		buttons[1] = button;

	}

	public void pushPowerButton() {
		buttons[0].push();
	}

	public void pushVolumeButton() {
		buttons[1].push();
	}

}
