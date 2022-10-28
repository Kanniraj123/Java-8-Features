package Stream.reduce;

import java.util.Optional;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class ReducePersonExample {
	public static void main(String[] args) {
		combinedName();
		MaxHeight(); 
	}
	
	static void combinedName() {
		String Str= PersonRepository.getAllPersons().stream().map(Person :: getName).reduce("", (a,b) -> a.concat(b).concat(" "));
		System.out.println("Combined "+ Str);
	}
	//find max height
	static void MaxHeight() {
		Optional<Person> person = PersonRepository.getAllPersons().stream().reduce( (x,y) -> x.getHeight() > y.getHeight() ? x : y);
		
		System.out.println("tallest Person "+ person.get());
	}
}
