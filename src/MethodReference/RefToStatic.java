package MethodReference;

import java.util.Comparator;

public class RefToStatic {

	public static void main(String[] args) {
		//Reference to static method 
		Comparator<Integer> com = RefToStatic :: compare;
		
		//lambda 
		Comparator<Integer> com1 = (a,b) -> compare(a,b);
		System.out.println("static example "+com.compare(10, 20));
	}
	
	static int compare(int a,int b) {
		return Integer.compare(a,b);
	}

}
