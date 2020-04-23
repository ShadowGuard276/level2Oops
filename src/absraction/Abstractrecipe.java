package absraction;

public abstract class Abstractrecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
abstract void getReady();
abstract void doTheDish();
abstract void cleanUp();
}
