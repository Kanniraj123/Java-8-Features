package TerminalOperation;

import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class SumAndAveragePersonExample {
	
	public static void main(String[] args) {
		double averageHeight = PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.averagingInt(Person :: getHeight));
		
		int totalkids = PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.summingInt(Person :: getKids));
		System.out.println("The average height is "+averageHeight);
		System.out.println("the total kids are "+totalkids);
	}
}
