package patronPrototype;

import patronSingleton.clase.Person;

public class PatronPrototype {

	public static void main(String[] args) {
		Person p1 = Person.getInstance();
		
		System.out.println(p1 + " -> " + p1.getName() + ", " + p1.getAge());
		
		
		p1.setName("Tata");
		System.out.println(p1 + " -> "+ p1.getName() + ", " + p1.getAge());

	}

}
