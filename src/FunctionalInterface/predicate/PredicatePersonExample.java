package FunctionalInterface.predicate;

import java.util.List;
import java.util.function.Predicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class PredicatePersonExample {
	static Predicate<Person> heightPredicate = per -> (per.getHeight() >= 140);
	static Predicate<Person> genderPredicate = per -> (per.getGender().equals("Male"));
	
	public static void main(String[] args) {
		List<Person> list = PersonRepository.getAllPersons();
		
		list.forEach(per -> {
			if(heightPredicate.and(genderPredicate).test(per)) {
				System.out.println("Person is "+ per);
			}
		});
	}

}
