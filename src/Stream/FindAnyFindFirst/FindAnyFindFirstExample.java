package Stream.FindAnyFindFirst;

import java.util.Optional;
import java.util.function.Predicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class FindAnyFindFirstExample {
	static Predicate<Person> check = (per) -> per.getHeight() >= 140;
	public static void main(String[] args) {
		Optional<Person> findany = findAny();
		if(findany.isPresent()) {
			System.out.println("Find any result "+ findany.get());
		}else {
			System.out.println("No Record Found");
		}
		Optional<Person> findfirst = findFirst();
		if(findfirst.isPresent()) {
			System.out.println("Find First result "+ findfirst.get());
		}else {
			System.out.println("No Record Found");
		}

	}
	
	static Optional<Person> findAny() {
		return PersonRepository.getAllPersons().stream().filter(check).findAny();
	}
	static Optional<Person> findFirst() {
		return PersonRepository.getAllPersons().stream().filter(check).findFirst();
	}
}
