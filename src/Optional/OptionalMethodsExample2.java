package Optional;

import java.util.Optional;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class OptionalMethodsExample2 {
	public static void main(String[] args) {
		orElse();
		orElseGet();
		orElseThrow();
	}
	
	static void orElse() {
		Optional<Person> name = PersonRepository.getPersonOptional();
		Optional<Person> name2 = Optional.of(new Person());
		String check = name2.map(Person :: getName).orElse("No Record Found");
		System.out.println("Or Else Example "+ check);
	}
	static void orElseGet() {
		Optional<Person> name = PersonRepository.getPersonOptional();
		Optional<Person> name2 = Optional.of(new Person());
		String check = name2.map(Person :: getName).orElseGet( () -> {
			return "No Record Found";
					});
		System.out.println("Or Else Get Example "+ check);
	}
	static void orElseThrow() {
		Optional<Person> name = PersonRepository.getPersonOptional();
		Optional<Person> name2 = Optional.of(new Person());
		String check = name2.map(Person :: getName).orElseThrow( () -> {
			return new RuntimeException("No Record Found");
					});
		System.out.println("Or Else Throw Example "+ check);
	}
	
}
