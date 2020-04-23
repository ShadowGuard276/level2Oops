package fanCreation;

public class fanRunner {
public static void main(String[] args) {
	Fan fan = new Fan("usha fan", 0.3212, " black" );
	
	System.out.println(fan);
	fan.switchOn();
	System.out.println(fan);
	fan.setSpeed((byte)6);
	System.out.println(fan);
	fan.switchOff();
	System.out.println(fan);
}
}
