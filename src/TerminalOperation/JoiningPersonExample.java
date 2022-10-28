package TerminalOperation;

import java.util.stream.Collectors;

import FunctionalInterface.repo.Person;
import FunctionalInterface.repo.PersonRepository;

public class JoiningPersonExample {
	static String joiningWithoutParam() {
		return PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining());
	}
	static String joiningWithParam() {
		return PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining(" - "));
	}
	static String joiningWith3Param() {
		return PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				.collect(Collectors.joining(" ","{ "," }"));
	}
	public static void main(String[] args) {
		System.out.println("No param Joining "+joiningWithoutParam());
		System.out.println("One param Joining "+joiningWithParam());
		System.out.println("Three param Joining "+joiningWith3Param());
		
	}

}
