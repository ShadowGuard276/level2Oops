package absraction;

public class RecipieWithOven extends Abstractrecipe {

	@Override
	void getReady() {
System.out.println("collect raw materials");
System.out.println("cut raw materials");
System.out.println("oven on");
	}

	@Override
	void doTheDish() {
		System.out.println("start grill");	
		System.out.println("oven off");
	}

	@Override
	void cleanUp() {
		System.out.println("clean utensils");
		System.out.println("oven.clean");
	}

}
