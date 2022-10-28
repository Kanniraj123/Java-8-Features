package DefaultAndStatic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class CollectionsNewMethodExample {

	public static void main(String[] args) {
		List<String> list = PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.toList());
		System.out.println("Before sorting --------");
		list.forEach(System.out :: println);
		Collections.sort(list);
//		System.out.println("After sorting --------");
//		list.forEach(System.out :: println);
		list.sort(Comparator.naturalOrder());
		System.out.println("natural Order --------");
		list.forEach(System.out :: println);
		list.sort(Comparator.reverseOrder());
		System.out.println("Reverse Order --------");
		list.forEach(System.out :: println);
		
		
	}

}
