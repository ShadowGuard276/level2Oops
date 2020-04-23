package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole game = new MarioGame();
		GamingConsole game1= new ChessGame();
		
		game.up();
		game.down();
		game.left();
		game.right();
		game1.up();
		game1.down();
		game1.left();
		game1.right();
		
	}

}
