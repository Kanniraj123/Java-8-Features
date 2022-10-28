package Stream.filter;

import java.util.function.Predicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class FilterPersonExample {
	static Predicate<Person> height = per -> per.getHeight() >= 140;
	static Predicate<Person> gender = per -> per.getGender() == "Male";
	static Predicate<Person> salary = per -> per.getSalary() >= 1000;
	public static void main(String[] args) {
		PersonRepository.getAllPersons()
		.stream()
		.filter(height.and(gender).and(salary))
		//.filter(gender)
		//.filter(salary)
		.forEach(System.out :: println);
	}

}
