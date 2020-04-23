package interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");
		
	}

	@Override
	public void down() {
		System.out.println("tunnel");
	}

	@Override
	public void left() {
		System.out.println("move left");
	}

	@Override
	public void right() {

		System.out.println("move forward");
	}

}
