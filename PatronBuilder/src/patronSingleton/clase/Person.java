package patronSingleton.clase;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		super();
	}

	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
	}
	
	
	// Getters && Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static class PersonBuilder {
		private String name;
		private int age;

	    public PersonBuilder() {}

	    public PersonBuilder name(String name) {
	        this.name = name;
	        return this;
	    }

	    public PersonBuilder age(int age) {
	        this.age = age;
	        return this;
	    }

	    public Person build() {
	        return new Person(this);
	    }
		
		
		
		
	}
	
	
	
	

}
