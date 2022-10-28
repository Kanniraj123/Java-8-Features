package TerminalOperation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class MappingPersonExample {
	static List<String> getNames(){
		List<String> name =  PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName )
				.collect(Collectors.toList());
		List<String> name1 =  PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.mapping(Person :: getName, Collectors.toList()));
		
		return name1;
	}
	static Set<String> getNamesBySet(){
		Set<String> name1 =  PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.mapping(Person :: getName, Collectors.toSet()));
		
		return name1;
	}
	static long counttallestPerson(){
		
		return   PersonRepository.getAllPersons()
				.stream()
				.filter( per -> per.getHeight() >= 140)
				.collect(Collectors.counting());
	}
	public static void main(String[] args) {
		System.out.println("List of Names "+getNames());
		System.out.println("Set of Names "+getNamesBySet());
		System.out.println("Count of 140 above tall person "+counttallestPerson());
	}

}
