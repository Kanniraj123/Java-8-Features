package Stream.Map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class MapPersonExample {
	static Function<Person,String> getname = Person :: getName;
	//static Function<Person,String> getname = per -> per.getName();
	static List<String> toUppertransform(List<Person> per){
		return per
				.stream()
				//.map(Person :: getName)
				.map(getname)
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
	}
	static List<String> toLowertransform(List<Person> per){
		return per
				.stream()
				.map(Person :: getName)
				.map(String :: toLowerCase)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<Person> persons = PersonRepository.getAllPersons();
		
		List<Integer> len = persons
							.stream()
							.map(Person :: getName)
							.map(String :: length)
							.collect(Collectors.toList());
		
		System.out.println("Person len is "+ len);
		
		System.out.println("Upper transform of name "+ toUppertransform(PersonRepository.getAllPersons()));
		System.out.println("Lower transform of name "+ toLowertransform(PersonRepository.getAllPersons()));
	}
}
