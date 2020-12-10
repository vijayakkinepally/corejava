package interfaces;

public interface Animal {
	
	public void name();
	public boolean canFly();
    
	default public void print() {
		System.out.println("from print1 method");
	}
	
	default  int print2() {
		System.out.println("from print2 method");
		return 0;
		
	}
	
	static public void print3() {
		
	}
	
}
