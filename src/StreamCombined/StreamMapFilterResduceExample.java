package StreamCombined;

import java.util.function.Predicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class StreamMapFilterResduceExample {
	static Predicate<Person> height = per -> per.getHeight() >= 140;
	static Predicate<Person> gender = per -> per.getGender() == "Male";
	public static void main(String[] args) {
		int count  = PersonRepository.getAllPersons()
				.stream()
				//.filter(height.and(gender))
				.map(Person :: getKids)
				.reduce(0, (x,y) -> x+y);
		System.out.println("Count is "+count);

	}

}
