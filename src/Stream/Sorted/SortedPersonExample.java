package Stream.Sorted;

import java.util.Comparator;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class SortedPersonExample {
	public static void main(String[] args) {
		System.out.println("Sorted by name");

		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getName))
				.forEach(per -> System.out.println(per));

		System.out.println("Sorted by height");

		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight))
				.forEach(per -> System.out.println(per));
		
		System.out.println("Sorted by height reversed");

		PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight).reversed())
				.forEach(per -> System.out.println(per));

	}
}
