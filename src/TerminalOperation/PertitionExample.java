package TerminalOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class PertitionExample {
	static Predicate<Person> height = (pre) -> pre.getHeight() >= 140; 
	static void grouping() {
		Map<Boolean,List<Person>> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.partitioningBy(height));
		
		Stream.of(map).forEach(System.out :: println);
	}
	static void groupinglevelone() {
		Map<String,Integer> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.groupingBy(Person :: getName,Collectors.summingInt(Person :: getKids)));
		
		Stream.of(map).forEach(System.out :: println);
	}
	static void groupingleveltwo() {
		Map<Boolean,Map<String,List<String>>> map = PersonRepository.getAllPersons()
										.stream()
										.collect(Collectors.partitioningBy(height,Collectors.toMap(Person :: getName, Person :: getHobbies) ));
		
		Stream.of(map).forEach(System.out :: println);
	}
	public static void main(String[] args) {
		grouping();
		groupinglevelone();
		groupingleveltwo();
	}
}
