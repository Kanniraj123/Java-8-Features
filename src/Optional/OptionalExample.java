package Optional;

import java.util.Optional;

import FunctionalInterface.repo.Person;

public class OptionalExample {

	public static void main(String[] args) {
		
		//System.out.println("Traditional way with no handle "+ personName(null));//NPE
		
		//with optional 
		
		System.out.println("With Optional "+ personname(null) );
	
	}
	
	static public String myname(String name) {
		return name;
	}
	//Traditional way
	static public String personName(Person per) {
		//if(null != per) {
			return per.getName();
		//}else {
		//	return "No record Found";
		//}
	}
	static public Optional<Person> personname(Person name){
		return Optional.ofNullable(name);
	}

}
