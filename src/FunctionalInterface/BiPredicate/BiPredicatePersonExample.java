package FunctionalInterface.BiPredicate;

import java.util.List;
import java.util.function.BiPredicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class BiPredicatePersonExample {
	static BiPredicate<Integer, String> filter = (a,b) -> {
		return a >= 140 && b == "Male";
	};
	public static void main(String[] args) {
		List<Person> list = PersonRepository.getAllPersons();
		list.forEach(per -> {
			if(filter.test(per.getHeight(),per.getGender())) {
				System.out.println("Person info : "+per);
			}
		});

	}

}
