package fanCreation;

public class Fan {

	private String make;
	private double radius;
	private String colour;
	private boolean isOn;
	private byte speed;
	public Fan(String make, double radius, String colour) {
		this.make =make;
		this.radius =radius;
		this.colour =colour;
		
	}
	public void switchOn() {
		this.isOn= true;
		setSpeed((byte)3);
	}
	public void switchOff() {
		this.isOn= false;
		setSpeed((byte)0);
	}
	
	public String toString() {
		return String.format("make %s, radius %f, colour %s, isOn %s, speed -%d", make, radius, colour, isOn, speed);
		
	}
	public void setSpeed(byte speed) {
		this.speed = speed;
	}

}
