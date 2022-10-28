package SequantialVsParallel;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class ParallelPersonExample {
	public static void main(String[] args) {
		seqPerson();
		ParPerson();
	}
	static List<String> seqPerson() {
		long start = System.currentTimeMillis();
		List<String> hobbie = PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end = System.currentTimeMillis();
		
		System.out.println("Sequantail Duration "+ (end - start));
		return hobbie;
	}
	
	static List<String> ParPerson(){
		long start = System.currentTimeMillis();
		List<String> hobbie = PersonRepository.getAllPersons()
				.stream().parallel()
				.map(Person :: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
		long end = System.currentTimeMillis();
		
		System.out.println("Parallel Duration "+ (end - start));
		return hobbie;
	}
}
