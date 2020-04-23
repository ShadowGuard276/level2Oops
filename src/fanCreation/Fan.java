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
	public String toString() {
		return String.format("make %s,\n radius %f,\n colour %s,\n isOn %s,\n speed -%d", make, radius, colour, isOn, speed);
		
	}

}
