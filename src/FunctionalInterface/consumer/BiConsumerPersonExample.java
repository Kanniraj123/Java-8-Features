package FunctionalInterface.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class BiConsumerPersonExample {
	static List<Person> list = PersonRepository.getAllPersons();
	static BiConsumer<String,List<String>> hobbies = (name,hobbie) -> System.out.println("Name : "+name+" hobbies : "+hobbie);
	static BiConsumer<String,Double> salary = (name,salary) -> System.out.println("Name : "+name+" Salary "+salary);
	public static void main(String[] args) {
		fetchhobbies();
		System.out.println("************************");
		fetchsalary();
	}
	
	static void fetchhobbies() {
		list.forEach((per) -> {
			hobbies.accept(per.getName(),per.getHobbies());
		});
	}
	static void fetchsalary() {
		list.forEach((per) -> {
			salary.accept(per.getName(),per.getSalary());
		});
	}
}
