package FunctionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println("add "+(x+y));
		BiConsumer<Integer, Integer> bc2 = (x,y) -> System.out.println("sub "+(x-y));
		
//		bc1.accept(20,10);
//		bc2.accept(20,10);
		bc1.andThen(bc2).accept(20,10);
		List<Integer> ls1 = Arrays.asList(1,2,3,4);
		List<Integer> ls2 = Arrays.asList(1,2,3);
		BiConsumer<List<Integer>, List<Integer>> bclist = (x,y) -> {
			if(x.size() == y.size()) System.out.println("True");
			else System.out.println("False");
		};
		bclist.accept(ls1, ls2);
	}
}
