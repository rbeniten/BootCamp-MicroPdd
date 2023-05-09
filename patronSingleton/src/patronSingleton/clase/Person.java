package patronSingleton.clase;

public class Person implements Cloneable{
	
	private static Person instance = null;
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static Person getInstance() {
        if (instance == null) {
            instance = new Person("Ruben", 21);
        }
        return instance;
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
	
	@Override
	public Person clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Person) super.clone();
	}
	

}
