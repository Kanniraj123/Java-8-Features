package FunctionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class ConsumerPerson {
	static Consumer<Person> c1 = (per) -> System.out.println(per);
	static Consumer<Person> c2 = (per) -> System.out.println(per.getName().toUpperCase());
	static List<Person> list = PersonRepository.getAllPersons();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWithCondition();
	}
	
	public static void printWithCondition() {
		list.forEach( (per) -> {
			if(per.getGender() == "Male" && per.getHeight() >= 140) {
				System.out.println(per);
			}
		});
	}

}
