package SequantialVsParallel;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequantialVsParallelExample {

	public static void main(String[] args) {
		System.out.println("Availble cores : "+Runtime.getRuntime().availableProcessors());
		String[] str = {"1","2","3","4","5","6","7","8","9","10"};
		
		System.out.println("Sequantial : "); 
		printstream(Arrays.stream(str));
		
		System.out.println("Parallel : "); 
		printstream(Arrays.stream(str).parallel());
		
		
	}
	static void printstream(Stream<String> str) {
		str.forEach(s -> {
			System.out.println(LocalTime.now() +" "+s+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
		});
	}

}
