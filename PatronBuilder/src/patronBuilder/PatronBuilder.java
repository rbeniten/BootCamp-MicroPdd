package patronBuilder;

import patronSingleton.clase.Person;

public class PatronBuilder {

	public static void main(String[] args) {
		
		Person person = new Person.PersonBuilder()
			    .name("Ruben")
			    .age(21)
			    .build();
		
		System.out.println(person.getName());
		System.out.println(person.getAge());

	}

}
