package FunctionalInterface.Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class FunctionPersonExample {
	static Predicate<Person> heights = (a) -> a.getHeight() >= 140;
	static Predicate<Person> gender = (a) -> a.getGender() == "Male";
	static Function<List<Person>,Map<String,Double>> salary = (hobbie) ->{
		Map<String,Double> map = new HashMap<>();
		hobbie.forEach( per ->{			
			if(heights.test(per) && gender.test(per)) {
				map.put(per.getName(), per.getSalary());
			}
			
		});
		return map;
	};
	
	public static void main(String[] args) {
		List<Person> list = PersonRepository.getAllPersons();
		System.out.println("Function generates map is "+salary.apply(list));
	}

}
