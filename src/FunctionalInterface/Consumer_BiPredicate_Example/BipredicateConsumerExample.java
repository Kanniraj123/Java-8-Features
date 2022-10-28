package FunctionalInterface.Consumer_BiPredicate_Example;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class BipredicateConsumerExample {
	static BiPredicate<Integer, String> filter = (a,b) -> {
		return a >= 140 && b == "Male";
	};
	static BiConsumer<String,List<String>> hobbies = (name,hobbie) -> System.out.println("Name : "+name+" hobbies : "+hobbie);
	public static void main(String[] args) {
		
		List<Person> list = PersonRepository.getAllPersons();
		
		list.forEach( per ->{
			if(filter.test(per.getHeight(),per.getGender())) {
				hobbies.accept(per.getName(), per.getHobbies());
			}
		});

	}

}
