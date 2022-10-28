package TerminalOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class GroupingExample {
	static void grouping() {
		Map<String,List<Person>> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.groupingBy(Person :: getGender));
		
		Stream.of(map).forEach(System.out :: println);
	}
	static void groupinglevelone() {
		Map<String,Integer> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.groupingBy(Person :: getName,Collectors.summingInt(Person :: getKids)));
		
		Stream.of(map).forEach(System.out :: println);
	}
	static void groupingleveltwo() {
		Map<String,List<Person>> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.groupingBy(Person :: getName,HashMap<String,List<Person>> :: new, Collectors.toList() ));
		
		Stream.of(map).forEach(System.out :: println);
	}
	public static void main(String[] args) {
		grouping();
		groupinglevelone();
		groupingleveltwo();
	}

}
