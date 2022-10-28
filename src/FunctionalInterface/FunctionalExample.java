package FunctionalInterface;

public class FunctionalExample {

}

@FunctionalInterface 
interface Functional{
	void add();
	
	default void add1() {
		System.out.println("Added default method in functional");
	}
	
	static void add2() {
		System.out.println("Added Static method in functional");
	}
	
}
