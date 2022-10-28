package TerminalOperation;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAverageExample {

	public static void main(String[] args) {
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = intlist.stream()
					.collect(Collectors.summingInt(Integer :: intValue));
		double average = intlist.stream()
				.collect(Collectors.averagingInt(Integer :: intValue));
		System.out.println("the Total  is "+sum);
		System.out.println("The average is "+average);
	}

}
