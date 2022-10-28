package Optional;

import java.util.Optional;

import FunctionalInterface.repo.Address;
import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class OptionalOtherExample {

	public static void main(String[] args) {
		

	}
	
	static void mapExample() {
		Optional<Person> name = PersonRepository.getPersonOptional();
		Optional<Person> name2 = Optional.of(new Person());
		String check = name2.map(Person :: getName).orElse("No Record Found");
		System.out.println("Map Example "+ check);
	}
	static void flatmapExample() {
		Optional<Person> name = PersonRepository.getPersonOptional();
		if(name.isPresent()) {
		Optional<Address> address = name.flatMap(Person :: getAddress);
		System.out.println("Map Example "+ address);
		}
	}
	static void filExample() {
		Optional<Person> name = PersonRepository.getPersonOptional().filter(per -> per.getHeight() >= 140);
		if(name.isPresent()) {
		Optional<Address> address = name.flatMap(Person :: getAddress);
		System.out.println("Map Example "+ address);
		}
	}

}
