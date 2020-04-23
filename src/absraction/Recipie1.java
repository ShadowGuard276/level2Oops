package absraction;

public class Recipie1 extends Abstractrecipe {

	@Override
	void getReady() {
System.out.println("collect raw materials");
System.out.println("cut raw materials");

	}

	@Override
	void doTheDish() {
		System.out.println("start grill");	
		
	}

	@Override
	void cleanUp() {
		System.out.println("clean utensils");
	}

}
