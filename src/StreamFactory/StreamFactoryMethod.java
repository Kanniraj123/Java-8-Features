package StreamFactory;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.*;
public class StreamFactoryMethod {
	static UnaryOperator<Integer> uo = x -> x + 5;
	static Supplier<Double> s = Math :: random;
	public static void main(String[] args) {
//		Stream<Integer> iterate = Stream.iterate(0, x-> x+5);
//		iterate.forEach(System.out :: println); ->infinte
		Stream<Integer> iterate = Stream.iterate(0, uo ).limit(10);
		iterate.forEach( System.out :: println); //-> limit upto 10
		
//		Stream<Double> generate = Stream.generate(s);
//		generate.forEach(System.out :: println);//-> infinte
		Stream<Double> generate = Stream.generate(s).limit(10);
		generate.forEach(System.out :: println);//-> limit upto 10
		
		Stream<Integer> generate1 = Stream.generate(new Random() :: nextInt).limit(10);
		generate1.forEach(System.out :: println);
		
		Stream<String> of = Stream.of("Apple","Orange","Banana","Mango");
		of.forEach(System.out :: println);

 
	}

}
