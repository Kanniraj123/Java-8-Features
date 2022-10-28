package FunctionalInterface.consumer;

import java.util.Comparator;

public class ComparableLamdaExample {

	public static void main(String[] args) {
		//before java 8
		Comparator<Integer> c1 = new Comparator<>() {
			@Override
			public int compare(Integer x,Integer y) {
				// TODO Auto-generated method stub
				return x.compareTo(y);
			}
		};
		System.out.println("java 7 "+ c1.compare(10, 10));
		//after java 8
		Comparator<Integer> c2 = (x,y) -> x.compareTo(y);
		System.out.println("Java 8 "+ c2.compare(10, 10));
	}

}
