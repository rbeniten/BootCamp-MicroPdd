package patronSingleton;

import patronSingleton.clase.Person;

public class PatronSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Ruben", 22);
		Person p2 = p1.clone();
		
		System.out.println(p1 + " -> " + p1.getName() + ", " + p1.getAge());
		
		
		System.out.println(p2 + " -> "+ p2.getName() + ", " + p2.getAge());

	}

}
