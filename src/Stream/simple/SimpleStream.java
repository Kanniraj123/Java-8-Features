package Stream.simple;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class SimpleStream {

	public static void main(String[] args) {
//		Stream<Integer> st = Stream.of(1,2,3,4,5,6);
//		//Arrays.asList("Apple","Orange","Banana","Pineapple");
//		
//		st.forEach( i -> System.out.println("i is "+i));
//		
//		List<Integer> list = Arrays.asList(0,1,2,3,4,5);
//		
//		list.forEach( i -> System.out.println("i is "+i));
		
//		List<Person> list = PersonRepository.getAllPersons()
//							.stream()
//							.filter(a -> a.getHeight() >= 140)
//							.collect(Collectors.toList());
//		System.out.println("Stream example "+ list);
		
		Predicate<Person> p1 = (per) -> per.getHeight() >=140 ;
		Predicate<Person> p2 = (per) -> per.getGender().equals("Male");
		
		Map<String,List<String>> personMap = PersonRepository
				.getAllPersons() // iterate all persons 
				.stream() // Stream of Persons
				.filter(p1) // Stream of Persons 
				.filter(p2) // Stream of Persons 
				.collect(Collectors
						.toMap(Person :: getName, Person :: getHobbies));
		System.out.println("Person Map :"+personMap);
		
		List<String> personHobbies = PersonRepository
				.getAllPersons() // List of Persons
				.stream() // Stream of Persons
				.map(Person :: getHobbies) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct()
				.collect(Collectors.toList());// collection to be returned
		
		System.out.println("Person Hobbies List :"+personHobbies);

	}

}
