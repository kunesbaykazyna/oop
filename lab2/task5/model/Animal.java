package lab2.task5.model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " (makes " + getSound() + ")";
    }

	public int getAge() {
		return age;
	}
	
	public String getName() { 
    	return name; 
    }
	
}
