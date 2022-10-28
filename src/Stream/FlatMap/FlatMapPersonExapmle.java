package Stream.FlatMap;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class FlatMapPersonExapmle {
	static List<String> getHobbies(List<Person> per) {
		return per.stream().map(Person::getHobbies).flatMap(List::stream).sorted().distinct()
				.collect(Collectors.toList());
	}

	static long getCountHobbies(List<Person> per) {
		return per.stream()
				.map(Person::getHobbies)
				.flatMap(List::stream).sorted()
				//.distinct()
				.count();
	}

	public static void main(String[] args) {
		System.out.println("Hobbies : " + getHobbies(PersonRepository.getAllPersons()));
		System.out.println("Hobbies : " + getCountHobbies(PersonRepository.getAllPersons()));
	}
}
