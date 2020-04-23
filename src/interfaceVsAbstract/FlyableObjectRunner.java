package interfaceVsAbstract;
	
interface Flyable{
	void fly();
}
class bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("fly with wings");
	}
	
}
class AeroPlane implements Flyable{

	@Override
	public void fly() {
		System.out.println("Fly with fuel");
	}
	
}
public class FlyableObjectRunner {

	public static void main(String[] args) {
		Flyable[] flyerObjects = {new bird(), new AeroPlane()}; 
		for(Flyable object:flyerObjects) {
			object.fly();
		}
	}

}
