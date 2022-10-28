package DefaultAndStatic;

import java.util.Comparator;
import java.util.List;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class CustomSortExample {
	static Comparator<Person> c1 = Comparator.comparing(Person :: getName);
	static Comparator<Person> c2 = Comparator.comparing(Person :: getHeight);
	static List<Person> list = PersonRepository.getAllPersons();
	public static void main(String[] args) {
//		sortByName();
//		sortByHeight();
		sortByNameandHeight();
	}
	
	static void sortByName() {
		list.sort(c1);
		list.forEach(System.out :: println);
	}
	
	static void sortByHeight() {
		list.sort(c2);
		list.forEach(System.out :: println);
	}
	static void sortByNameandHeight() {
		list.sort(c1.thenComparing(c2));
		list.forEach(System.out :: println);
	}
	
	static void sortByNameandHeightbyNull() {
		Comparator<Person> c3 = Comparator.nullsFirst(c1); //append null first
		Comparator<Person> c4 = Comparator.nullsLast(c1); // append null last
		list.sort(c1.thenComparing(c2));
		list.forEach(System.out :: println);
	}

}
