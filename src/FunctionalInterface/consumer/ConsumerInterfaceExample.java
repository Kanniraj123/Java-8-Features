package FunctionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		//c1.accept("Raja");
		Consumer<String> c2 = s -> System.out.println(s.toLowerCase());
		//c2.accept("RAJA");
		c1.andThen(c2).accept("Raja");
		//Not accept different type	
	}

}
