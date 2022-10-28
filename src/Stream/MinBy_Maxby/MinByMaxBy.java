package Stream.MinBy_Maxby;

import java.util.Comparator;
import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class MinByMaxBy {
	static Optional<Person> getTallestPerson(){
	return PersonRepository.getAllPersons()
			.stream()
			.collect(Collectors.maxBy(Comparator.comparing(Person :: getHeight)));
		
	}
	static Optional<Person> getShortestPerson(){
		return PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Person :: getHeight)));
	}
	//avoid optional in result
	static List<Person> MultipleFilterPerson(){
		List<Person> list = new ArrayList<>();
		
		Person tallest = getTallestPerson().get();
		if(null != tallest) {
			list = PersonRepository.getAllPersons().stream().filter( per -> per.getHeight() == tallest.getHeight()).collect(Collectors.toList());
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.println("tallest person "+ getTallestPerson());
		System.out.println("Shotest person "+ getShortestPerson());
		System.out.println("Filtered "+ MultipleFilterPerson());
	}

}
