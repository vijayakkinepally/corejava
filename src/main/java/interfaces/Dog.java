package interfaces;

public class Dog implements Animal {

	@Override
	public void name() {
		System.out.println("From Dog object");
		
	}

	@Override
	public boolean canFly() {
		
		return false;
	}

}
