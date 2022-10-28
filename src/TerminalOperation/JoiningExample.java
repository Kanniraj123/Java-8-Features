package TerminalOperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

	public static void main(String[] args) {
		char[] ch = {'a','b','c','d'};
		String str = Stream.of(ch)
					 .map(arr -> new String(arr))
					 .collect(Collectors.joining());
		System.out.println("Combined Word is "+ str);
	}

}
