package LocalVariable;

import java.util.function.Consumer;

public class LambdaLocalVairable {
	static int c = 30;
	public static void main(String[] args) {
		int b = 20;
		Consumer<Integer> con = a -> {
			System.out.println("a is "+a);
			System.out.println("b is "+b);
			// modification not possible b++;
			System.out.println("c before modify is "+c);
			c = 40;
			System.out.println("c after modify is "+c);
		};

	}

}
