package MethodReference;

import java.util.Comparator;

public class RefToNonStatic {
	public static void main(String[] args) {
		
		RefToNonStatic obj = new RefToNonStatic();
		Comparator<Integer> com  = obj :: compare;
		
		System.out.println("Non static Example "+com.compare(20, 10));
		
	}
	
	public int compare(int a,int b) {
		return Integer.compare(a, b);
	}
}
